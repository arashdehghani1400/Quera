import java.util.Scanner;

public class FindBoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        showState(str);
    }

    /**
     * @param str string array for input
     */
    private static void showState(String[] str) {
        if (str[1].equals(str[3])) {
            System.out.println("Horizontal");
        } else if (str[0].equals(str[2])) {
            System.out.println("Vertical");
        } else {
            System.out.println("Try again");
        }
    }
}
