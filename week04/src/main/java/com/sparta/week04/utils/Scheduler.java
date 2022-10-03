package com.sparta.week04.utils;

import com.sparta.week04.domain.Product;
import com.sparta.week04.domain.ProductRepository;
import com.sparta.week04.dto.ItemDto;
import com.sparta.week04.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.json.JSONException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RequiredArgsConstructor
@Component // 스프링이 필요 시 자동으로 생성하는 클래스 목록에 추가
public class Scheduler {
    private final ProductRepository productRepository;
    private final ProductService productService;
    private final NaverShopSearch naverShopSearch;

    // 순서: 초, 분, 시, 일, 월, 주
    @Scheduled(cron = "0 0 1 * * *")
    public void updatePrice() throws InterruptedException, JSONException {
        System.out.println("가격 업데이트 실행");

        List<Product> productList = productRepository.findAll();
        for (int i=0; i<productList.size(); i++) {
            // 1초에 한 상품씩 조회
            TimeUnit.SECONDS.sleep(1);
            Product p = productList.get(i);
            String title = p.getTitle();
            String resultString = naverShopSearch.search(title);

            List<ItemDto> itemDtoList = naverShopSearch.fromJSONtoItems(resultString);
            ItemDto itemDto = itemDtoList.get(0);
            Long id = p.getId();
            productService.updateBySearch(id, itemDto);
        }
    }
}
