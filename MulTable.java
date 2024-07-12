import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        MultiplicationT(number);
    }

    /**
     * Result Show Multiplication Table.
     *
     * @param number is input for user.
     */
    private static void MultiplicationT(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print((i + 1) * (j + 1) + " ");
            }
            System.out.println();
        }
    }

}
