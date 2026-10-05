import java.util.Scanner;

public class Exercise_02_08 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int timeZone = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds%60;

        long totalMinutes = totalSeconds/60;
        long currentMinutes =totalMinutes%60;

        long totalHours = totalMinutes/60;
        long currentHours = totalHours%24+timeZone;


        System.out.println("The current time is: "+currentHours+":"+currentMinutes+":"+currentSeconds);


    }
}
// If you are checking this, just know that I say hi!
// This exercise code is purely written by @dragonroos with her own mind and hands for self-educational purposes!
