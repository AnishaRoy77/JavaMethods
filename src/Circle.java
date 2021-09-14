import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r = sc.nextInt();
        System.out.println("Circumference of the Circle is : "  + Circumference(r));
        System.out.println("Area of the Circle is : "  + area(r));

    }
    static float Circumference(int r){
        float c = (float) (2*3.14*r);
        return c;
    }

    static float area(int r){
        float a = (float) (3.14*r*r);
        return a;
    }
}
