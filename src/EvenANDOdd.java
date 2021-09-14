public class EvenANDOdd {
    public static void main(String[] args) {
        int n = 50;
        check(n);

    }
    // Condition Check
    // Bitwise AND of any odd number by 1 gives 1
    static void check(int n){
        if((n&1) == 1){
            System.out.println("odd");
        }
    else{

            System.out.println("even");
        }
    }
}


