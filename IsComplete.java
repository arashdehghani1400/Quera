import java.util.Scanner;

public class IsComplete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }
        if (number == sum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
