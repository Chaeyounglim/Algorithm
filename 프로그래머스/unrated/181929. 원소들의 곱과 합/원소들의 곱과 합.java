class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int sub = 1;
        for(int i=0; i<num_list.length; i++){
            sum += num_list[i];
            sub *= num_list[i];
        }
        return (sum*sum>sub) ? 1 : 0;
    }
}