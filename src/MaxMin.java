
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int n3 = sc.nextInt();
        System.out.println(" Largest of three numbers " + n1 +"," + n2 + "," + n3 +" is : " + Max(n1,n2,n3));
        System.out.println(" Smallest of three numbers " + n1 +"," + n2 + "," + n3 +" is : " + Min(n1,n2,n3));

    }

    static int Max(int n1, int n2, int n3) {
        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        return max;
    }

    static int Min(int n1, int n2, int n3) {
        int min = n1;
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        return min;
    }
}


