import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] money = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05};

        String[] names = {
                "500 Euro bill",
                "200 Euro bill",
                "100 Euro bill",
                "50 Euro bill",
                "20 Euro bill",
                "10 Euro bill",
                "5 Euro bill",
                "2 Euro coin",
                "1 Euro coin",
                "50 Cent coin",
                "20 Cent coin",
                "10 Cent coin",
                "5 Cent coin"
        };

        System.out.print("Due amount: ");
        double dueAmount = scanner.nextDouble();

        System.out.print("Received amount: ");
        double receivedAmount = scanner.nextDouble();

        double change = receivedAmount - dueAmount;
        change = Math.round(change * 20) / 20.0;

        System.out.println();
        System.out.printf("Change: %.2f Euro%n", change);
        System.out.println();

        for (int i = 0; i < money.length; i++) {

            int count = (int) (change / money[i]);

            if (count > 0) {
                System.out.println(names[i] + ": " + count);
            }

            change = change - (count * money[i]);
            change = Math.round(change * 100) / 100.0;
        }

        scanner.close();
    }
}
