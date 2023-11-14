import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        // for(int i : nums){
        //     if(!list.contains(i)) list.add(i);
        // }
        //return Math.min(nums.length/2,list.size());
        
        Set<Integer> list = new HashSet<>();
        for(int i : nums){
            list.add(i);
        }

        return Math.min(nums.length/2,list.size());
    }
}