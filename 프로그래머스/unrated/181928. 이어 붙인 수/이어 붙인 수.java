class Solution {
    public int solution(int[] num_list) {
        String evenStr = "";
        String oddStr = "";
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0)
                evenStr += String.valueOf(num_list[i]);
            else oddStr += String.valueOf(num_list[i]);
        }
        return Integer.parseInt(evenStr)+ Integer.parseInt(oddStr);
    }
}