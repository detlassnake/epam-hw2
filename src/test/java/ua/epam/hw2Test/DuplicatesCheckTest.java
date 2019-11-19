package ua.epam.hw2Test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DuplicatesCheckTest {      //Task 5
    int[] inputArr1 = {9,2,3,1};
    int[] inputArr2 = {1,1,1,3,3,4,3,2,4,2};
    DuplicatesCheck dc = new DuplicatesCheck();

    boolean result1;
    boolean result2;
    @Test
    public void testDuplicatesCheck1() {
        dc.setArr(inputArr1);
        result1 = dc.duplicates();
        assertEquals(result1, false);
    }
    @Test
    public void testDuplicatesCheck2() {
        dc.setArr(inputArr2);
        result2 = dc.duplicates();
        assertEquals(result2, true);
    }
    @Test
    public void testDuplicatesCheckEmptyArr() {
        dc.setArr(new int[]{});
        result2 = dc.duplicates();
        assertEquals(result2, false);
    }
    @Test
    public void testDuplicatesCheckNullArr() {
        int[] nullArr = null;
        dc.setArr(nullArr);
        result2 = dc.duplicates();
        assertEquals(result2, false);
    }
}
