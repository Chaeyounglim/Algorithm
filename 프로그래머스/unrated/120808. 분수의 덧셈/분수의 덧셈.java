class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0,0};
        int denom, numer = 0;
        
        if(denom1==denom2){
            denom = denom1;
            numer = numer1 + numer2;
        }else {
            denom = (denom1*denom2);
            numer = (denom1*numer2) + (denom2*numer1);
        }
        
        int denom_result = denom;
        int numer_result = numer;
        
        for(int i =1; i<=denom; i++){
            if(denom%i==0 && numer%i==0){
                denom_result = denom /i;
                numer_result = numer /i;
            }
        }
        answer[0] = numer_result;
        answer[1] = denom_result;
        return answer;
    }
}