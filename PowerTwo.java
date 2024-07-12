import java.util.Scanner;

public class PowerTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        showBigPower(number);
    }

    /**
     * show big number after considering number
     *
     * @param number is input that written with user
     */
    private static void showBigPower(int number) {
        int count = 1;
        while (number >= count) {
            count *= 2;
        }
        System.out.println(count);
    }
}
