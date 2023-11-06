class Solution {
    private double findSlope(int[] arr1, int[] arr2){
        return (double) (arr1[1]-arr2[1]) / (arr1[0]-arr2[0]);
    }
    
    public int solution(int[][] dots) {
        if(findSlope(dots[0], dots[1]) == findSlope(dots[2],dots[3]))
            return 1;
        
        if(findSlope(dots[0], dots[2]) == findSlope(dots[3],dots[1]))
            return 1;
        
        if(findSlope(dots[0], dots[3]) == findSlope(dots[2],dots[1]))
            return 1;
        
        return 0;
    }
}