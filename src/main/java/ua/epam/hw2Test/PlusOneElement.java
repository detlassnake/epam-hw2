package ua.epam.hw2Test;

public class PlusOneElement {       //Task 4
    private int arr[];
    public int[] plusOne() {
        if (arr == null) {
            return new int[]{};
        }
        int lastIndex = arr.length - 1;
        arr[lastIndex]++;
        do {
            if(arr[lastIndex] == 10) {
                arr[lastIndex] = 0;
                arr[lastIndex-1]++;
            }
            lastIndex--;
        } while (lastIndex != 0);
        return arr;
    }
    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
