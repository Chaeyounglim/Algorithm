class Solution {
    public int solution(int chicken) {
        // 서비스 치킨의 수
        // 1마리당 쿠폰 1개
        // 쿠폰 10개 치킨 한마리(쿠폰발급)
        
        int answer = 0;
        
        while(chicken>=10){
            int newChick = chicken/10;
            int restChick = chicken%10;
            chicken = newChick + restChick;
            answer+=newChick;
        }
        return answer;
    }
}