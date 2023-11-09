class Solution {
    public int solution(String number) {
        return number.chars().map(c->(c-'0')%9).sum()%9;
            
//         int eachSum = 0;
        
//         String[] list = number.split("");
//         for(String str : list)
//             eachSum += Integer.parseInt(str);
        
//         return eachSum%9;
    }
}