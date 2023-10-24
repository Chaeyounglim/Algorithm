import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf(
           (n%2==1) ? "%d is odd" : "%d is even" , n
        );
    }
}