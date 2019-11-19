package ua.epam.hw2Test;

public class DuplicatesCheck { //Task 5
    private int[] arr;
    public boolean duplicates() {
        if (arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
