package tdd;

import java.util.*;

public class FizzBuzz {

    public List<String> isNumberFizzBuzz(int n){

        List<String> resultList = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 3 != 0 && i % 5 != 0){
                resultList.add(String.valueOf(i));
            }else if(i % 3 == 0 && i % 5 == 0) {
                resultList.add("FizzBuzz");
            }else if(i % 3 == 0){
                resultList.add("Fizz");
            }else{
                resultList.add("Buzz");
            }
        }

        return resultList;
    }
}
