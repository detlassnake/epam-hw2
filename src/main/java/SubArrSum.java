public class SubArrSum {    //Task 1
    private int arr[];
    int maxSubArrSum() {
        int maxSegmentSum = Integer.MIN_VALUE;
        int maxEndingSum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingSum = maxEndingSum + arr[i];
            if (maxSegmentSum < maxEndingSum)
                maxSegmentSum = maxEndingSum;
            if (maxEndingSum < 0)
                maxEndingSum = 0;
        }
        return maxSegmentSum;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }
}


