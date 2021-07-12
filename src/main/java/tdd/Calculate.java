package tdd;

import org.decimal4j.util.DoubleRounder;

import java.util.Arrays;

public class Calculate {

    public int getMinimumValue(int[] array){
        return Arrays.stream(array)
                .min()
                .getAsInt();
    }

    public int getMaximumValue(int[] array){
        return Arrays.stream(array)
                .max()
                .getAsInt();
    }

    public long getNumberOfElements(int[] array){
        return Arrays.stream(array)
                .count();
    }

    public double getAverageValue(int[] array){
        double asDouble = Arrays.stream(array)
                .average()
                .getAsDouble();

        return DoubleRounder.round(asDouble, 6);
    }
}
