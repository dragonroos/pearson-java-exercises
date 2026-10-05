import java.util.Scanner;

public class Exercise_02_06 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");
        int x = input.nextInt();
        int firstx = x;
        int one = x%10;
        x = x/10;
        int ten = x%10;
        x = x/10;
        int hundred = x;

        System.out.println("The multiplication of all digits in "+firstx+" is "+one*ten*hundred);

    }
}
// If you are checking this, just know that I say hi!
// This exercise code is purely written by @dragonroos with her own mind and hands for self-educational purposes!

