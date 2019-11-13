import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class PlusOneElementTest {    //Task 4
    int[] inputArr = {1,9,9,9};
    int[] result = PlusOneElement.plusOne(inputArr);
    @Test
    public void testPlusOneElement() {
        assertArrayEquals(result, new int[] {2,0,0,0});
    }
}
