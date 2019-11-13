import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DuplicatesCheckTest {      //Task 5
    int[] inputArr1 = {9,2,3,1};
    int[] inputArr2 = {1,1,1,3,3,4,3,2,4,2};
    boolean result1 = DuplicatesCheck.duplicates(inputArr1);
    boolean result2 = DuplicatesCheck.duplicates(inputArr2);
    @Test
    public void testDuplicatesCheck() {
        assertEquals(result1, false);
        assertEquals(result2, true);
    }
}
