import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SubArrSumTest {    //Task 1
    int[] inputArr = {2, 1, -3, 4, -1, 2, 1, -5, 4};
    int result = SubArrSum.maxSubArrSum(inputArr);
    @Test
    public void testSubArrSum() {
        assertEquals(result,6);
    }
}
