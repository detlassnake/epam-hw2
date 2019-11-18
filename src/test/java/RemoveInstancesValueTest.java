import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveInstancesValueTest {     //Task 2
    RemoveInstancesValue riv = new RemoveInstancesValue();
    int[] inputArr = {0,1,2,2,3,0,4,2};
    int inputVal = 2;
    int result;
    @Test
    public void testRemoveInstancesValue() {
        riv.setArr(inputArr);
        riv.setValue(inputVal);
        result = riv.removeValue();
        assertEquals(result, 5);
    }
    @Test
    public void testRemoveInstancesValueEmptyArr() {
        riv.setArr(new int[]{});
        riv.setValue(inputVal);
        result = riv.removeValue();
        assertEquals(result, 0);
    }
}
