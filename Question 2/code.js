// Given an integer N. Check whether N is prime or not. (Prime or NotPrime)
// Sample input: N = 10
// Sample output: NotPrime

let number = prompt("Enter the number to check prime : ");

function checkPrime(num){
    if(num <= 1){
        return console.log("Prime");
    }
    
    for(let i = 2; i < Math.sqrt(num); i++){
        if(num % i == 0){
            return console.log("NotPrime");
        }
    }
    return console.log("Prime");
}

checkPrime(parseInt(number));
