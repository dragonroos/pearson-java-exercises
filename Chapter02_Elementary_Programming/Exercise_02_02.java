import java.util.Scanner;

public class Exercise_02_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of the sides and height of the Equilateral triangle: ");
        double side = input.nextDouble();
        double height = input.nextDouble();

        double area = (Math.sqrt(3.0)/4.0)*side*side;
        double volume = area*height;

        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);


    }
}
// If you are checking this, just know that I say hi!
// This exercise code is purely written by @dragonroos with her own mind and hands for self-educational purposes!

