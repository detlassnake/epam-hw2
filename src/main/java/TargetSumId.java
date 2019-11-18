public class TargetSumId {     //Task 3
    private int[] arr;
    private int target;
    int[] targetSumIndex() {
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

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setTarget(int target) {
        this.target = target;
    }
}
