class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer str = new StringBuffer();
        
        for(int i=0; i<code.length(); i++){
            if(i%q==r) str.append(code.charAt(i));
        }
        return str.toString();
    }
}