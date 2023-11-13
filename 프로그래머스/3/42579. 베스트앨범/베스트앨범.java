import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        
        Map<String,Integer> playSum = new HashMap<>();
        Map<String,Map<Integer,Integer>> music = new HashMap<>();
        
        for(int i=0; i<genres.length;i++){
            if(!playSum.containsKey(genres[i])){
                Map<Integer,Integer> album = new HashMap<>();
                album.put(i,plays[i]);
                music.put(genres[i],album);
                playSum.put(genres[i],plays[i]);
            }else {
                music.get(genres[i]).put(i,plays[i]);
                playSum.put(genres[i],playSum.get(genres[i])+plays[i]);
            }
        }
        List<String> keySet = new ArrayList(playSum.keySet());
        Collections.sort(keySet, (s1,s2) -> playSum.get(s2)-playSum.get(s1));
        
        for(String key : keySet){
            Map<Integer, Integer> map = music.get(key);
            List<Integer> genre_key = new ArrayList(map.keySet());
            Collections.sort(genre_key, (s1,s2)-> map.get(s2)-map.get(s1)); // 재생횟수에 따른 내림차순 정렬
            
            answer.add(genre_key.get(0));
            if(genre_key.size()>1)
                answer.add(genre_key.get(1));
        }
        
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}