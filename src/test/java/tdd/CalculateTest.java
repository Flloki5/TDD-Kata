package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    private Calculate calculate;
    private int[] testArray;

    @BeforeEach
    public void beforeEachTestMethod(){
        this.calculate = new Calculate();
        this.testArray = new int[]{6, 9, 15, -2, 92, 11};
    }

    @Test
    public void minimumValueAreReturned(){
        int expectedNumber = calculate.getMinimumValue(testArray);

        assertThat(-2).isEqualTo(expectedNumber);
    }

    @Test
    public void maximumValueAreReturned(){
        int expectedNumber = calculate.getMaximumValue(testArray);

        assertThat(92).isEqualTo(expectedNumber);
    }

    @Test
    public void numberOfElementsAreReturned(){
        long expectedNumber = calculate.getNumberOfElements(testArray);

        assertThat(6).isEqualTo(expectedNumber);
    }

    @Test
    public void averageValueAreReturned(){
        double expectedNumber = calculate.getAverageValue(testArray);

        assertThat(21.833333).isEqualTo(expectedNumber);
    }
}
