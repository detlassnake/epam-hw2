public class SubArrSum {    //Task 1
    static int maxSubArrSum(int arr[]) {
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
}

