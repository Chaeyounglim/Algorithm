import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        while(i<arr.length){
            int index = list.size();
            if(index==0) 
                list.add(arr[i++]);
            else {
                if(list.get(index-1)<arr[i])
                    list.add(arr[i++]);
                else{
                    list.remove(index-1);
                }
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}