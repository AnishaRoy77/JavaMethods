//Write a function to check if a given no is Pythagorean triplet or not.
/*
A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number.
    Pythagorean Triplet:
        c*c = a*a + b*b
*/

import java.util.Scanner;
public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pythagorean Triplet\n");
        System.out.println("Enter the number of elements you want to store: ");
        int n = sc.nextInt();// n = array size
        System.out.println("Enter elements of the array (e.g: [3,4,5] : ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            //reading array elements from the user
            array[i] = sc.nextInt();
        }
        boolean triplet = checkTriplet(array, n);
        System.out.println(triplet);
        if (triplet) {
            System.out.println("Pythagorean Triplet Exist");
        } else {
            System.out.println("Pythagorean Triplet Not Exist");
        }

    }

    static boolean checkTriplet(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = array[i] * array[i];
                    int y = array[j] * array[j];
                    int z = array[k] * array[k];
                    if ((x + y) == z || (y + z) == x || (x + z) == y) {
                        System.out.println("Pythagorean Triplet in array is "  +  "(" +  array[i] + ", " + array[j] + " ," + array[k] +  ")");
                        return true;
                    }
                }
            }
        } return false;
    }
}








