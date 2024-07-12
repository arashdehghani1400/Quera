import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings1 = string.split("");
        for (String s : strings1) {
            printNum(s);
        }
    }

    /**
     * print str for base default structure
     *
     * @param str input a string
     */
    private static void printNum(String str) {
        System.out.print(str + ": ");
        int num = Integer.parseInt(str);
        for (int i = 0; i < num; i++) {
            System.out.print(str);
        }
        System.out.println();
    }
}
