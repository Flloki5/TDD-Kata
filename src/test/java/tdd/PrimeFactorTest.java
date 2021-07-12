package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorTest {


    @Test
    public void emptyListAreReturned(){

        List<Integer> expectedList = PrimeFactor.generate(1);

        assertThat(expectedList.isEmpty());
    }

    @Test
    public void oneItemListAreReturned(){

        List<Integer> expectedList = PrimeFactor.generate(2);

        assertThat(2).isEqualTo(expectedList.get(0));
    }

    @Test
    public void ListAreReturned(){

        ArrayList<Integer> expectedList = PrimeFactor.generate(100);
        ArrayList<Integer> actualList = new ArrayList(List.of(2,2,5,5));

        assertThat(actualList).isEqualTo(expectedList);
    }
}
