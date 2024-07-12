import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            String str = scanner.nextLine();
            if (str.equals("0"))
                break;
            numbers[i] = Integer.parseInt(str);
        }
        reverseNum(numbers);
    }

    /**
     * reverse input Array
     *
     * @param numbers is Array input
     */
    private static void reverseNum(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != 0)
                System.out.println(numbers[i]);
        }
    }
}
