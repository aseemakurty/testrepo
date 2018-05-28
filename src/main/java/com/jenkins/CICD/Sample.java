package com.jenkins.CICD;

public class Sample {

    public String fizzOrBuzz(int number) {
        String result = "";
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 5 == 0) {
            result =  "Buzz";
        } else if (number % 3 == 0) {
            result= "Fizz";
        }
        return result;
    }

}
