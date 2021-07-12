package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void beforeEachTestMethod(){
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void numberValueAreReturned(){

        List<String> expected = fizzBuzz.isNumberFizzBuzz(2);
        List<String> actual = Arrays.asList("1", "2");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void fizzValueAreReturned(){

        List<String> expected = fizzBuzz.isNumberFizzBuzz(4);
        List<String> actual = Arrays.asList("1", "2", "Fizz", "4");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void buzzValueAreReturned(){

        List<String> expected = fizzBuzz.isNumberFizzBuzz(5);
        List<String> actual = Arrays.asList("1", "2", "Fizz", "4", "Buzz");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void fizzbuzzAreReturned(){

        List<String> expected = fizzBuzz.isNumberFizzBuzz(15);
        List<String> actual = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void sizeOfListAreReturned(){

        long expected = fizzBuzz.isNumberFizzBuzz(100).size();

        assertThat(100).isEqualTo(expected);
    }
}

