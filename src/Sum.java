import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number  : ");
        int n2 = sc.nextInt();
        System.out.println("Sum : " +  sum(n1 , n2));

    }
    static int sum(int n1 ,int n2){
        int sum = n1+n2;
        return sum;
    }
}
