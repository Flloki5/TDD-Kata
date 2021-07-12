package tdd;

import java.util.*;

public class PrimeFactor {

    static ArrayList<Integer> generate(int argument){

        ArrayList<Integer> resultList = new ArrayList<>();

        if(argument <= 1){
            return resultList;
        }else if(argument == 2){
            resultList.add(2);
            return resultList;
        }else{
            for(int i = 2; i < argument; i++) {
                while(argument % i == 0) {
                    resultList.add(i);
                    argument = argument / i;
                }
            }
            return resultList;
        }
    }
}
