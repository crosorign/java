public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(getNthFenonacciSeries(5));
        System.out.println(getNthFenonacciSeries(10));
        System.out.println(getNthFenonacciSeries(20));

    }

    private static int getNthFenonacciSeries(int n) {
        if (n < 2) {
            return n;
        } else {
            return getNthFenonacciSeries(n - 1) + getNthFenonacciSeries(n - 2);
        }
    }
}
