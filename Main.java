public class Main {
    public static void main(String[] args) {

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
        b--;
        if (b == 0)
            return minus_one(a);
        a = subtract(a, b);
        return minus_one(a);
    }

}
