package tdd;

import java.util.*;
import java.util.stream.Collectors;

public class Kata {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> convertedList = Arrays.stream(elements).boxed()
                .collect(Collectors.toList());

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int i = 0; i < convertedList.size(); i++){
            Integer element = convertedList.get(i);
            if(map.containsKey(element) && map.get(element) != maxOccurrences){
                Integer integer = map.get(element);
                map.put(convertedList.get(i), integer + 1);
                resultList.add(element);
            }else if(!map.containsKey(element)) {
                map.put(element, 1);
                resultList.add(element);
            }
        }

        return resultList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

