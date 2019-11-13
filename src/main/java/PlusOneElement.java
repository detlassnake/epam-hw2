public class PlusOneElement {       //Task 4
    static int[] plusOne(int arr[]) {
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
}
