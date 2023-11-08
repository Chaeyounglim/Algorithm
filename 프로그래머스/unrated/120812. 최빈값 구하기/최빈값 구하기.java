import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        int index = 0;
        int maxNum = array[array.length-1];
        int[] cntList = new int[maxNum+1];
        
        for(int i=0; i<array.length; i++){
            cntList[array[i]]++;
        }
        maxNum = cntList[0];
        for(int i=1; i<cntList.length; i++){
            if(cntList[i]>maxNum){
                maxNum = cntList[i];
                index = i;
            }else if(cntList[i] == maxNum)
                index = -1;
        }
        return index;
    }
}