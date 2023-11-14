import java.util.*;

class Solution {
    public boolean solution(String[] phoneBook) {
        Set<String> setList = new HashSet<>();
        
        for(String book : phoneBook){
            setList.add(book);
        }
        
        for(String book : setList){
            for(int i=1; i<book.length(); i++)
                if(setList.contains(book.substring(0,i))) return false;
        }
        return true;
    }
}