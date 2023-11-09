class Solution {
    public int solution(String number) {
        int sumResult = 0;
        int eachSum = 0;
        
        String[] list = number.split("");
        for(String str : list)
            eachSum += Integer.parseInt(str);
        sumResult = eachSum%9;
        
        return sumResult;
    }
}