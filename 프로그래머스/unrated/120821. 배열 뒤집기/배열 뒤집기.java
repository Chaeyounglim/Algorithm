class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length--];
        
        for(int i=length; i>=0; i--){
            answer[length-i] = num_list[i];
        }
        return answer;
    }
}