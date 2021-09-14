//Java Program to Check if a Given Integer is Odd or Even
public class EvenOdd {
    public static void main(String[] args) {
        int n = 50;
        even(n);
        odd(n);

    }
    // Using Brute Force
    static void even(int n) {
        if (n % 2 == 0) {
            System.out.println("Number is even");
        }
    }
    static void odd(int n){
        if(n % 2 != 0){
            System.out.println("Number is odd");
        }
    }
}





