public class Main {
    public static void main(String[] args) {

    }

    private static int plusOne(int a) {
        return a + 1;
    }

    private static int plus(int a, int b) {
        if (b == 1) {
            return plusOne(a);
        } else {
            return plusOne(plus(a, b - 1));
        }
    }
}
