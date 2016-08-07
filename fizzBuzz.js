var fizzBuzz = function (number) {
    var fizz = (number % 3 ) == 0;
    var buzz = (number % 5 ) == 0;
    var result = '';

    if (fizz) result += 'Fizz';
    if (buzz) result += 'Buzz';
    if (!fizz && !buzz) result += number;

    console.log (result);
}

for(let i = 1; i <= 100; i++){
    fizzBuzz(i);
}






