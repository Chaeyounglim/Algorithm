import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List arrList = Arrays.asList(arr);
        
        int[] answer = new int[queries.length];
        
        for(int i = 0; i<queries.length; i++){
            int min = arrList.get(queries[i][0]);
            int max = arrList.get(queries[i][1]);
            for(int j = min; j<= max; j++){
                if(j>arrList.get(queries[i][2])) {
                    answer[i] = j; 
                    arrList.remove(arrList.indexOf(j));
                    break;
                }
            }
            
        }
        return answer;
    }
}