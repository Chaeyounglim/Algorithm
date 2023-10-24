import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++){
            int ch = a.charAt(i);
            if(ch>=65 && ch<=90){ 
                ch = (int)ch+32;
            }else{
                ch = (int)ch-32;
            }
                System.out.printf("%c", ch);
        }
        
    }
}