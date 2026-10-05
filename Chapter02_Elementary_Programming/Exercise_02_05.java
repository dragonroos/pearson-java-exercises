import java.util.Scanner;

public class Exercise_02_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.println("Enter the gratuity rate: ");
        double rate = input.nextDouble();

        double gratuity = subtotal*rate/100.0;
        double total = subtotal+gratuity;

        System.out.println("The gratuity is $"+gratuity+" ant total is $"+total);
    }
}
// If you are checking this, just know that I say hi!
// This exercise code is purely written by @dragonroos with her own mind and hands for self-educational purposes!

