import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int result = 0;
        
        for(int p : priorities)
            queue.offer(p);
        // Result : [2,1,3,2]
        
        while(!queue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == queue.peek()){
                    queue.poll();
                    result++;
                  if(i==location){
                        return result;
                    }// end of inner if();
                }// end of outter if();
            }// end of for();
        }// end of while();
        
        return result;
    }
}