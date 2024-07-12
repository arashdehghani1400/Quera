import java.util.Scanner;

public class gerdo {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int n = scanner.nextInt(); // Distance to the wall
       int x = scanner.nextInt(); // Length of the foot
       int y = scanner.nextInt(); // Width of the foot

       int[] result = solveGame(n, x, y);

       if (result[0] == -1) {
           System.out.println("-1");
       } else {
           System.out.println( result[0]);
           System.out.println( result[1]);
       }
   }

   public static int[] solveGame(int n, int x, int y) {
       int maxLongitudinalSteps = n / x;
       int maxTransverseSteps = n / y;

       if (n % x != n % y) {
           return new int[]{-1}; // No solution
       }

       int longitudinalSteps = 0;
       while ((n - (longitudinalSteps * x)) % y != 0) {
           longitudinalSteps++;
       }

       int transverseSteps = n - (longitudinalSteps * x);

       return new int[]{longitudinalSteps, transverseSteps};
   }
}
