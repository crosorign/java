public class SecondMaxElementInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 7, 9, 11, 10};
        int first = 0, second = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > first) {
                first = a[i];
            }
            if (a[i] < first && a[i] > second) {
                second = a[i];
            }
        }
        System.out.println("second highest value" + second);
    }
}
