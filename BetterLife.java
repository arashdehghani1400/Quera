import java.util.Scanner;

public class BetterLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int row = Integer.parseInt(str[0]);
        int column = Integer.parseInt(str[1]);
        int rowSolution = 11 - row;
        int columnSolution = 21 - column;
        if (column <= 10) {
            System.out.println("Right " + rowSolution + " " + column);
        } else {
            System.out.println("Left " + rowSolution + " " + columnSolution);
        }
    }
}
