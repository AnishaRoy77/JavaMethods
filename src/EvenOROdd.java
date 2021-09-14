public class EvenOROdd {
    public static void main(String[] args) {
        int n = 9;
        even(n);
        odd(n);
    }
    //using Bitwise OR
    // Condition check
    // if n|1 if greater than n then this number is even
    static void even(int n){
        if((n|1) > n){
            System.out.println("Even");
        }
    }
    static void odd(int n){
        if((n|1)== n){
            System.out.println("odd");
        }
    }
}
