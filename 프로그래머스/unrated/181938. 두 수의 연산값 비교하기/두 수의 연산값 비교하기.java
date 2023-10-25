class Solution {
    public int solution(int a, int b) {
        
        String ab = String.valueOf(a)+ String.valueOf(b);
        int result1 = Integer.parseInt(ab);
        int result2 = 2*a*b;
        
        return result1>result2 ? result1 : result2;
    }
}