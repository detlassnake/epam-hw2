import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TargetSumIdTest {   //Task 3
    int[] inputArr = {4, 4, 11, 15};
    int inputTarget = 26;
    int[] resultArr = TargetSumId.targetSumIndex(inputArr,inputTarget);
    @Test
    public void testTargetSumId() {
        assertArrayEquals(resultArr, new int[]{2,3});
    }
}
