class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = (numer1*denom2) + (numer2*denom1);
        
        for(int i = denom ; i>=1; i--){
            if(denom%i==0 && numer%i==0){
                denom /= i;
                numer /= i;
                break;
            }
        }
        
        
        int[] answer = {numer,denom};
        return answer;
        
        // 방법1
//         if(denom1==denom2){
//             denom = denom1;
//             numer = numer1 + numer2;
//         }else {
//             denom = (denom1*denom2);
//             numer = (denom1*numer2) + (denom2*numer1);
//         }
        
//         int denom_result = denom;
//         int numer_result = numer;
        
//         for(int i =1; i<=denom; i++){
//             if(denom%i==0 && numer%i==0){
//                 denom_result = denom /i;
//                 numer_result = numer /i;
//             }
//         }
        
//         int[] answer = {numer_result,denom_result};
//         return answer;
    }
}