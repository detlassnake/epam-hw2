import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SubArrSumTest {    //Task 1
    SubArrSum sas = new SubArrSum();
    int[] inputArr = {2, 1, -3, 4, -1, 2, 1, -5, 4};
    int result;
    @Test
    public void testSubArrSum() {
        sas.setArr(inputArr);
        result = sas.maxSubArrSum();
        assertEquals(result,6);
    }
    @Test
    public void testSubArrSumEmptyArr() {
        sas.setArr(new int[]{});
        result = sas.maxSubArrSum();
        assertEquals(result,Integer.MIN_VALUE);
    }
}
