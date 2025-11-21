import java.util.Random;
import java.util.Scanner;

public class GridHighlighter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n = 0;

        while (true) {
            System.out.print("Enter grid size (N): ");
            String input = sc.nextLine();

            try {
                n = Integer.parseInt(input);
                if (n > 0) break;
                else System.out.println("Please enter a positive number!");
            } catch (Exception e) {
                System.out.println("Invalid input! Enter a valid number.");
            }
        }

        int[][] grid = new int[n][n];

        System.out.println("\nGenerated Grid:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int even = 2 + (rand.nextInt(10) * 2);
                grid[i][j] = even;
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }

        int x = 0;
        while (true) {
            System.out.print("\nSelect a number to highlight (2–20): ");
            String input = sc.nextLine();

            try {
                x = Integer.parseInt(input);
                if (x >= 2 && x <= 20 && x % 2 == 0) break;
                else System.out.println("Invalid! Enter an even number between 2 and 20.");
            } catch (Exception e) {
                System.out.println("Invalid input! Enter a valid number.");
            }
        }

        int count = 0;

        System.out.println("\nHighlighted Grid:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == x) {
                    System.out.print("[" + grid[i][j] + "]\t");
                    count++;
                } else {
                    System.out.print(grid[i][j] + "\t");
                }
            }
            System.out.println();
        }

        System.out.println("\nNumber " + x + " occurred " + count + " times.");
        sc.close();
    }
}

