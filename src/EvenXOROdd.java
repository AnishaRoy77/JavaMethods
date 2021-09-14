public class EvenXOROdd {

        public static void main(String[] args) {
            int n = 9;
            even(n);
            odd(n);
        }
        //using Bitwise XOR
        // Condition check
        // if n^1 == n+1 then this number is even


    // if n^1 == n-1 then this number is even .. e.g : num = 8 -> 8^1 == 8+1  i.e.  9 then even (binary rep of 8 = 1 0 0 0
    //                                                              binary rep of 1 =                Bitwise XOR   0  0 0 1
//                                                                   rep of 9 in binary                            1  0 0 1
    //                                              Result- Number was even so bitwise And by 1 increment the value

    static void even(int n){
            if ((n ^ 1) == n + 1) {
                System.out.println("Number is Even");
            }
        }
    // if n^1 == n-1 then this number is odd .. e.g : num = 5 -> 5^1 == 5-1  i.e.  4 then odd (binary rep of 5 =   0  1  0  1
     //                                                              binary rep of 1 =                Bitwise XOR  0  0  0  1
//                                                                   rep of 4 in binary                            0  1  0  0
    //                                              Result- Number was odd so bitwise And by 1 decrement the value

        static void odd(int n){
            if((n^1)== n-1){
                System.out.println("odd");
            }
        }
    }


