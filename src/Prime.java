// An optimized solution of program to check if a number is prime or not.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        Prime(n);

    }
    static int Prime(int n){
        if(n <= 1){
            System.out.println("Neither Prime nor composite.");
        }
      int c = 2;
        if(n == 4){
            System.out.println("Not Prime");
        }else{
            while(c*c < n){
                if(n%c == 0){
                    System.out.println("Not Prime");
                    return n;
                }
                c = c+1;
            }if(c*c > n){
                System.out.println("Prime Number");
            }
        }return n;
    }
}





