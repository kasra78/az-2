import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("To plus params enter \"+\" and to subtract them enter \"-\":");
        String operator = scanner.next();
        if (operator.equals("+")) {
            System.out.println(sum(a, b));
        } else if (operator.equals("-")) {
            System.out.println(subtract(a, b));
        } else {
            System.out.println("Operation invalid");
        }
    }

    private static int plusOne(int a) {
        return a + 1;
    }

    private static int sum(int a, int b) {
        if (b < 0) {
            return subtract(a, -b);
        } else if (b == 0) {
            return a;
        } else if (b == 1) {
            return plusOne(a);
        } else {
            return plusOne(sum(a, b - 1));
        }
    }

    private static int minusOne(int a) {
        return a - 1;
    }

    private static int subtract(int a, int b) {
        if (b == 1) {
            return minusOne(a);
        }
        b--;
        a = subtract(a, b);
        return minusOne(a);
    }
}
