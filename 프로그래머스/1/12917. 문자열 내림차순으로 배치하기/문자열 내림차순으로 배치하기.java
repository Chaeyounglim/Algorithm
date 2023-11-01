import java.util.*;

class Solution {
    public String solution(String s) {
        String result = "";
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String a : str)
           result += a;
        
        return result;
    }
}