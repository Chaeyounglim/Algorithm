import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<progresses.length;i++){
            int remain = 100-progresses[i];
            int day = remain%speeds[i]==0 ? remain/speeds[i] : remain/speeds[i]+1;
            q.offer(day);
        }
        
        while(!q.isEmpty()){
            int i = q.poll();
            int count = 1;
            while(!q.isEmpty() && q.peek()<=i ){
                q.poll();
                count++;
            }
            list.add(count);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}