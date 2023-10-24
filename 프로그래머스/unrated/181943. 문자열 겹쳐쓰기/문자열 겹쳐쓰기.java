class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s);
        
        int arr1_length = my_string.length();
        int arr2_length = overwrite_string.length();
        
        for(int j=0; j<overwrite_string.length(); j++){
            answer += overwrite_string.charAt(j);
        }
        
        int sub_length = arr1_length - arr2_length - s;
        if(sub_length>0){
            for(int i=s+arr2_length; i<arr1_length; i++){
                answer += my_string.charAt(i);
            }
        }
        
        
        return answer;
    }
}