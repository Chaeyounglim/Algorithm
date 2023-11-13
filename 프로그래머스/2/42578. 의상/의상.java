import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int result = 1;
        
        for(String[] value : clothes) 
            map.put(value[1],(map.getOrDefault(value[1],0)+1));
        
        for(int i : map.values()){
            result *= i+1;
        }
        
        return result-1;
    }
}