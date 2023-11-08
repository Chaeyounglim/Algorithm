import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            List<Integer> list=new ArrayList();
            for(int j = queries[i][0]; j<=queries[i][1]; j++){
                list.add(arr[j]);
            }
            Collections.sort(list);
            for(int k:list){
                if(k>queries[i][2]){
                    answer[i]=k;
                    break;
                }
            }
            answer[i] = answer[i]==0 ? -1 : answer[i];
        }
        
        return answer;
    }
}