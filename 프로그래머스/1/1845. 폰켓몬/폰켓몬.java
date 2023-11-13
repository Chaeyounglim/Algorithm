import java.util.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(!list.contains(i)) list.add(i);
        }
            System.out.println(list.toString());
        
        
        // if((nums.length/2+1) == list.size()){
        //     return list.size();
        // }else {
        //     list.size()+1;
        // }
        return (nums.length/2 < list.size()) ? nums.length/2 : list.size() ;
    }
}