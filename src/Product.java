import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int n2 = sc.nextInt();
        System.out.println("Product : "  + prod(n1,n2));
    }
    static int prod(int n1 , int n2){
        int pro = n1*n2;
        return pro;
    }
}
