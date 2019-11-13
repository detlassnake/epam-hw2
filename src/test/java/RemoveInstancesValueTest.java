import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveInstancesValueTest {     //Task 2
    int[] inputArr = {0,1,2,2,3,0,4,2};
    int inputVal = 2;
    int result = RemoveInstancesValue.removeValue(inputArr, inputVal);
    @Test
    public void testRemoveInstancesValue() {
        assertEquals(result, 5);
    }
}
