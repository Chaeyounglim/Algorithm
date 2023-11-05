import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] cnt = {0,0,0};
        
        for(int i=0; i<answers.length; i++){
            int result = answers[i];
            
            // 1번 수포자
            if( (i+1)%5 == result%5) cnt[0]++;
            
            // 2번 수포자
            if(i%2==0) { 
                cnt[1] = result == 2 ? cnt[1]+1 : cnt[1];
            }else{ // index: 1357 , answer: 1345
                int index = i%8;
                if((index==1 || index==3) && result==index){
                    cnt[1]++;
                }else if(index==5 && result==(index-1)){
                    cnt[1]++;                    
                }else if(index==7 && result==(index-2)){
                    cnt[1]++;
                }
            }
            
            // 3번 수포자
            switch(i%10){
                case 0,1:
                    cnt[2] = result==3 ? cnt[2]+1 : cnt[2];
                    break;
                case 2,3:
                    cnt[2] = result==1 ? cnt[2]+1 : cnt[2];
                    break;
                case 4,5:
                    cnt[2] = result==2 ? cnt[2]+1 : cnt[2];
                    break;
                case 6,7:
                    cnt[2] = result==4 ? cnt[2]+1 : cnt[2];
                    break;
                case 8,9:
                    cnt[2] = result==5 ? cnt[2]+1 : cnt[2];
                    break;
                default:
                    break;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        int max = Math.max(cnt[0], Math.max(cnt[1],cnt[2]));
        for(int i=0; i<cnt.length; i++){
            if(max == cnt[i])
                list.add(i+1);
        }        
        
        return list.stream().mapToInt(i->i).toArray();
    }
}