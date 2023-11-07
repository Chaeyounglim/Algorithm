class Solution {
    public int solution(int a, int d, boolean[] included) {
        int result = 0;
        int num = a;
        for(int i=1; i<=included.length; i++){
            if(included[i-1]){
                result += num;
            }// 3
            //1 3 / 2 3+d / 3 3+d+d
            // 0일 때 3+1*4 7
            // 1일때 7+8
            num = a + i*d;
        }
        
        return result;
    }
}