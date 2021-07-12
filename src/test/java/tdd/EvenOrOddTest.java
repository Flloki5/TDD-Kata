package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    private EvenOrOdd evenOrOdd;

    @BeforeEach
    public void beforeEachTestMethod(){
        this.evenOrOdd = new EvenOrOdd();
    }

    @Test
    public void checkIsEvenOrOdd(){

        String expectedValue1 =  evenOrOdd.getOddOrEven(new int[]{0});
        String expectedValue2 =  evenOrOdd.getOddOrEven(new int[]{2, 5, 34, 6});
        String expectedValue3 =  evenOrOdd.getOddOrEven(new int[]{0, -1, -5});

        assertAll(() -> assertEquals("even", expectedValue1),
                () -> assertEquals("odd", expectedValue2),
                () -> assertEquals("even", expectedValue3));
    }
}
