package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ListComparatorTest {

    private ListComparator listComparator;

    @BeforeEach
    public void beforeEachTestMethod(){
        this.listComparator = new ListComparator();
    }

    @Test
    public void numberOfCommonPartAreReturned(){

        int[] testArray1 = new int[]{1, 2, 3, 4};
        int[] testArray2 = new int[]{1, 2, 3};

        int expected = listComparator.compare(testArray1, testArray2);

        assertThat(3).isEqualTo(expected);
    }

}
