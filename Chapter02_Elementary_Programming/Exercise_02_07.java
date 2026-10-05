import java.util.Scanner;

public class Exercise_02_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int totaldays = minutes/(60*24);
        int years = totaldays/365;
        int days = totaldays%365;

        System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days.");
    }
}
// If you are checking this, just know that I say hi!
// This exercise code is purely written by @dragonroos with her own mind and hands for self-educational purposes!

