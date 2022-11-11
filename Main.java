import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("If you want to add the numbers enter 1, if you want to subtract them enter 2:");
        int x = scanner.nextInt();
        if (x == 1)
            System.out.println(plus(a, b));
        else if (x == 2)
            System.out.println(subtract(a, b));
        else
            System.out.println("Error!");
    }

    private static int plusOne(int a) {
        return a + 1;
    }

    private static int plus(int a, int b) {
        if (b < 0) {
            return subtract(a, -b);
        } else if (b == 0) {
            return a;
        } else if (b == 1) {
            return plusOne(a);
        } else {
            return plusOne(plus(a, b - 1));
        }
    }

    private static int minus_one(int a) {
        return a - 1;
    }

    static int subtract(int a, int b) {
        if (b == 1)
            return minus_one(a);
        b--;
        a = subtract(a, b);
        return minus_one(a);
    }

}
