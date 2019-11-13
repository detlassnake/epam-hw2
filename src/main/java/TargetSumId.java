public class TargetSumId {     //Task 3
    static int[] targetSumIndex(int[] arr, int target) {
        int[] indexArr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    indexArr[0] = j;
                    indexArr[1] = i;
                }
            }
        }
        return indexArr;
    }
}
