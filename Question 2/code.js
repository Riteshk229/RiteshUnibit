// Given an integer N. Check whether N is prime or not. (Prime or Not Prime)
let number = prompt("Enter the number to check prime : ");

function checkPrime(num){
    if(num <= 1){
        return console.log(`${num} is not a prime`);
    }
    
    for(let i = 2; i < Math.sqrt(num); i++){
        if(num % i == 0){
            return console.log(`${num} is not a prime` );
        }
    }
    return console.log(`${num} is a prime`);
}

checkPrime(parseInt(number));
