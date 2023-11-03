import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> intArr = new ArrayList<>();
        
        do{
            // if(num<0) break;
            intArr.add((int)(n%10));
            n /= 10;
        }while(n>0);
        
        return intArr.stream().mapToInt(i->i).toArray();
    }
}