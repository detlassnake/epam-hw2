package ua.epam.hw2Test;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TargetSumIdTest {   //Task 3
    TargetSumId tsi = new TargetSumId();
    int[] inputArr = {4, 4, 11, 15};
    int inputTarget = 26;
    int[] resultArr;
    @Test
    public void testTargetSumId() {
        tsi.setArr(inputArr);
        tsi.setTarget(inputTarget);
        resultArr = tsi.targetSumIndex();
        assertArrayEquals(resultArr, new int[]{2,3});
    }
    @Test
    public void testTargetSumIdEmptyArr() {
        tsi.setArr(new int[] {});
        tsi.setTarget(inputTarget);
        resultArr = tsi.targetSumIndex();
        assertArrayEquals(resultArr, new int[]{0,0});
    }
    @Test
    public void testTargetSumIdNullArr() {
        int[] nullArr = null;
        tsi.setArr(nullArr);
        tsi.setTarget(inputTarget);
        resultArr = tsi.targetSumIndex();
        assertArrayEquals(resultArr, new int[]{});
    }
}
