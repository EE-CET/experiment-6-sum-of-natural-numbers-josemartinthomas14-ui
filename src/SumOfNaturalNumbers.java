import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int NumberSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(NumberSum(n));
        }
        scanner.close();
    }
}
