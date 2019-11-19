package ua.epam.hw2Test;

public class RemoveInstancesValue {     //Task 2
    private int[] arr;
    private int value;
    public int removeValue() {
        if (arr == null) {
            return -1;
        }
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != value) {
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
