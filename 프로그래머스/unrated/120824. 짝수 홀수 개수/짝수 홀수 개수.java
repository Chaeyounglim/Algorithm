class Solution {
    public int[] solution(int[] num_list) {
        int even_cnt =0 , odd_cnt = 0;
        
        int[] answer = {0,0};
        
        for(int i=0; i<num_list.length; i++){
            answer[num_list[i] % 2]++;
        }
        return answer;
    }
}