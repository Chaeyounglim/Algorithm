class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer(my_string);

        for(int[] query : queries){
            StringBuffer temp = new StringBuffer(sb.substring(query[0],query[1]+1));
            temp.reverse();
            sb.replace(query[0],query[1]+1,temp.toString());
        }
        return sb.toString();
    }
}