class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            for(int i=0; i<arr.length; i++){
                arr[i] = (i>=query[0] && i<=query[1] && i%query[2]==0) ? arr[i]+1 : arr[i];
            }
        }
        
        return arr;
    }
}