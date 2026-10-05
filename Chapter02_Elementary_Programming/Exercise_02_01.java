import java.util.Scanner;

public class Exercise_02_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a mile value: ");
        double mile = input.nextDouble();

        double kilometer = 1.6*mile;
        System.out.println(mile+" miles is "+kilometer+" kilometers.");

    }
}
// If you are checking this, just know that I say hi!
// This exercise code is purely written by @dragonroos with her own mind and hands for self-educational purposes!

