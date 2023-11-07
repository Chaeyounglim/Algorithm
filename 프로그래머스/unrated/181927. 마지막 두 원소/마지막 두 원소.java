class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length+1];
        
        for(int i=0; i<length; i++){
            answer[i] = num_list[i];
        }
        
        int lastFirst = num_list[num_list.length-1];
        int lastSecond = num_list[num_list.length-2];
        
        answer[length] = (lastFirst>lastSecond) ? lastFirst - lastSecond  : lastFirst*2;
        
        return answer;
    }
}