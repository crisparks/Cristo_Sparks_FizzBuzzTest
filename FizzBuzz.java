public class FizzBuzz {
    public String fizzBuzz(int number) {
        String string1 = "Fizz";
        String string2 = "Buzz";
        String string3 = "FizzBuzz";
        if((number % 3 == 0) == true && (number % 5 == 0) == false) { //divisible 3
            return string1;
        } 
        else if((number % 5 == 0) == true && (number % 3 == 0) == false) { // divisible by 5
            return string2;
        }  
        else if((number % 3 == 0) == true && (number % 5 == 0) == true) { // divisible by 3 and 5
            return string3;
        }  
        else {
            return Integer.toString(number); // not divisible by 3  or 5
        }
    }
}


