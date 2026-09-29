public class Exercise_01_04 {
    public static void main(String[] args) {
        System.out.printf("%-7s%-7s%-7s%-7s%n", "a", "a^2", "a^3", "a^4");

        System.out.printf("%-7d%-7d%-7d%-7d%n", 1, 1, 1, 1);
        System.out.printf("%-7d%-7d%-7d%-7d%n", 2, 4, 8, 16);
        System.out.printf("%-7d%-7d%-7d%-7d%n", 3, 9, 27, 81);
        System.out.printf("%-7d%-7d%-7d%-7d%n", 4, 16, 64, 256);

        //Or we can just use a loop! exciting
        System.out.printf("%-7s%-7s%-7s%-7s%n", "a", "a^2", "a^3", "a^4");
        for (int a = 1; a <= 4; a++) {
            System.out.printf("%-7d%-7d%-7d%-7d%n", a, a * a, a * a * a, a * a * a * a);
        }
    }
}
// If you are checking this, just know that I say hi!
// This exercise code is purely written by @dragonroos with her own mind and hands for self-educational purposes!
