class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length%n==0 ? num_list.length/n : num_list.length/n+1;
        int[] answer = new int[length];
        
        
        int index = 0;
        for(int i=0; i<num_list.length;i=i+n){
            if(index==length) break;
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}