// Given an integer N. Print the number from 1 to N and for multiple of “3” print “Fizz” instead of the number
// for the multiple of “5” print “Buzz” and for both 3 and 5 print “FizzBuzz”,
// Sample input: N = 10
// Sample output: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz.

let number = prompt("Enter the upper bound : ");

function fizzbuzz(num){
    let i = 1; let ans = "";
    while ( i <= num){
        if(i % 15 == 0){
            ans += "FizzBuzz ";
        } else if ( i % 3 == 0){
            ans += "Fizz ";
        } else if ( i % 5 == 0){
            ans += "Buzz ";
        } else {
            ans += i + " ";
        } 
        i++;
    }
    console.log(ans);
}

fizzbuzz(parseInt(number));
