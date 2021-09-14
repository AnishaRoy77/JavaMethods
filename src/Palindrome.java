import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        palindrome(n);
    }
       static void palindrome(int n){
        int temp , sum=0 , rem;
        temp = n ;
        while(n>0){
            rem = n%10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        if(sum == temp){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not palindrome number");
        }

    }
}
