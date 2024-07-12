import java.util.Scanner;

public class Barare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        whichArea(number);
    }

    private static void whichArea(int number) {
        if (number % 2 == 0) {
            System.out.println("Bala Barare");
        } else {
            System.out.println("Payin Barare");
        }
    }
}
