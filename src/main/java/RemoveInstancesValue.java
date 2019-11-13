public class RemoveInstancesValue {     //Task 2
    static public int removeValue(int[] arr, int value) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != value) {
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
}
