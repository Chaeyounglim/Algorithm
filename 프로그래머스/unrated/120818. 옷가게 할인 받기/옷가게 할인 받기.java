class Solution {
    public int solution(int price) {
        
        if(price>=500000)
            return (int)(price*0.8);
        else if(price>=300000)
            return (int)(price*0.9);
        else if(price>=100000)
            return (int)(price*0.95);
        else if(price>0)
            return (int)price;
        else return 0;
    }
}