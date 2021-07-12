package tdd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListComparator {

    public int compare(int[] array1, int[] array2){

        List convertedList1 = convertToList(array1);
        List convertedList2 = convertToList(array2);

        int beforeSize = convertedList1.size();

        convertedList1.removeAll(convertedList2);

        return beforeSize - convertedList1.size();
    }

    private List convertToList(int[] array){
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
    }
}
