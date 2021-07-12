package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YearTest {

    private Year year;

    @BeforeEach
    public void beforeEachTestMethod(){
        this.year = new Year();
    }

    @Test
    public void leapYearAreReturned(){

        assertAll(() -> assertFalse(year.isLeapYear(1800)),
                () -> assertTrue(year.isLeapYear(1880)),
                () -> assertFalse(year.isLeapYear(1811)));

    }
}
