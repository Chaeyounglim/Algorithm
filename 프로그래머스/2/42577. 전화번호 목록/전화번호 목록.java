import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> setList = new HashSet<>();
        
        for(String book : phone_book){
            setList.add(book);
        }
        
        for(String book : phone_book){
            for(int i=1; i<book.length(); i++){
                if(setList.contains(book.substring(0,i))) return false;
            }
        }
        return true;
    }
}