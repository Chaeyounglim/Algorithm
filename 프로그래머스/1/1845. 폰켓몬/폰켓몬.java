import java.util.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(!list.contains(i)) list.add(i);
        }
        return (nums.length/2 < list.size()) ? nums.length/2 : list.size() ;
    }
}