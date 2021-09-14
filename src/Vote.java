import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        age(age);
    }
    static void age(int age){
        if(age >= 18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
