public class BinarySearchInJava {

    public static void main(String[] args) {
        // binary search works for sorted array
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        doBinarySearch(a, 0, a.length - 1, 7);
        // array,first position,last position,key to be found

    }

    private static void doBinarySearch(int[] a, int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) // avoid infinite looop
        {
            if (a[mid] == key) {
                System.out.println("element found " + a[mid]);
                break;
            }
            if (a[mid] < key) {
                first = mid + 1; // moving to second part of array
            } else {
                last = mid - 1; // movin to fist part of array
            }
            mid = (first + last) / 2;
        }
    }
}
