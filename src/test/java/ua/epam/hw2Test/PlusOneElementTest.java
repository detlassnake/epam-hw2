package ua.epam.hw2Test;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class PlusOneElementTest {    //Task 4
    PlusOneElement pol = new PlusOneElement();
    int[] inputArr = {1,9,9,9};
    int[] result;
    @Test
    public void testPlusOneElement() {
        pol.setArr(inputArr);
        result = pol.plusOne();
        assertArrayEquals(result, new int[] {2,0,0,0});
    }
    @Test
    public void testPlusOneElementNullArr() {
        int[] nullArr = null;
        pol.setArr(nullArr);
        result = pol.plusOne();
        assertArrayEquals(result, new int[]{});
    }
}
