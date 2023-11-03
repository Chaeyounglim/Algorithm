class Solution {
    public String solution(String s, int n) {
        StringBuffer sb = new StringBuffer();
        
        for(char c : s.toCharArray()){
            
            if(c == ' ') {
                sb.append(c);
                continue;
            }
            
            if(c+n > 'z' || (c>='A'&&c<='Z') && n+c>'Z') {
                c = (char)(c + n - 26);
            }else { c = (char)(c + n); }
            sb.append(c);
        }
        return sb.toString();
    }   
}