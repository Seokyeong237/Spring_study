let fruits = ['사과', '감', '수박', '감', '딸기', '감']

function countFruit(name) {
    let persimmon = 0;

    for (let i=0; i<fruits.length; i++) {
        if (fruits[i] == name) {
            persimmon++;
        }
    }
    return persimmon;
}

let count = countFruit('감');
console.log(count);