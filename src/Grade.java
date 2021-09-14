import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        int count, i , a=0;
        float totalMarks = 0, percentage, average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Subjects : ");
        count = sc.nextInt();

        for (i = 0; i < count; i++){

            System.out.println("Enter marks of subject : ");
            totalMarks += sc.nextInt();
            System.out.println("Out of (e.g : 95/100) : ");
            a += sc.nextInt();
        }


        System.out.println("Total MArks : " + totalMarks);
        System.out.println("out of : " + a );
        average = totalMarks/count;
        percentage = (totalMarks / (count * a)) * a;
        System.out.println("Average marks : " + average);
        System.out.println("Percentage : " + percentage);
        grade(percentage);


    }
    static void grade(float percentage){
        if (percentage > 90){
            System.out.println("Grade AA");
        }
        else if(percentage >=81 || percentage <= 90){
            System.out.println("Grade AB");
        }else if(percentage >= 71 || percentage <= 80){
            System.out.println("Grade BB");
        }else if(percentage >= 61 || percentage <= 70){
            System.out.println("Grade BC");
        }else if(percentage >= 51 || percentage <= 60){
            System.out.println("Grade CD");
        }else if(percentage >= 41 || percentage <= 50){
            System.out.println("Grade DD");
        }else{
            System.out.println("Fail");
        }
    }
}