import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();


//         List<Integer> intArr = new ArrayList<>();
        
//         do{
//             intArr.add((int)(n%10));
//             n /= 10;
//         }while(n>0);
        
//         return intArr.stream().mapToInt(i->i).toArray();
    }
}