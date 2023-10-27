class Solution {
    public String solution(String my_string, int m, int c) {
        int length = my_string.length()%m==0 ? my_string.length()/m :my_string.length()/m+1;
        String answer = "";
        String[] list = new String[length];
        
        for(int i=0; i<length; i++){
            answer += my_string.substring(0,m).charAt(c-1);
            my_string = my_string.substring(m);
        }
        
        return answer;
    }
}