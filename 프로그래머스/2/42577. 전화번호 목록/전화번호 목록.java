import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        List<String> list = new ArrayList(Arrays.asList(phone_book));
        
        Collections.sort(list);
        
        for(int i=0; i<list.size()-1;i++){
            String num1 = list.get(i);
            String num2 = list.get(i+1);
            if(num2.startsWith(num1)) return false;
        }
        return true;
    }
}