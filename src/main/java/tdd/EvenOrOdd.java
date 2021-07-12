package tdd;

import java.util.Arrays;

public class EvenOrOdd {

    public String getOddOrEven(int[] array){
        int sum = Arrays.stream(array)
                .sum();

        if(sum % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }
}

