import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            String str = i + "";
            int count = 0;
            for(int j=0; j<str.length(); j++){ 
                if(str.charAt(j) =='0' || str.charAt(j)=='5')
                    count++;
            }
            if(count == str.length()){
                list.add(i);
            }
        }
        if(list.size() == 0) return new int[]{-1};
        return list.stream().mapToInt(i->i).toArray();
    }
}