public class PermutationsOfString {

    public static void main(String[] args) {
        String value = "ab";
        permute(value, 0, value.length());
    }

    private static void permute(String value, int begin, int end) {
        if (begin == end) {
            System.out.println(value);
        }
        for (int i = begin; i < end; i++) {
            value = swap(value, begin, i); // forward
            permute(value, begin + 1, end);
            value = swap(value, begin, i); // back track
        }
    }

    private static String swap(String value, int start, int end) {
        char[] character = value.toCharArray();
        char temp = character[start];
        character[start] = character[end];
        character[end] = temp;
        return String.valueOf(character);
    }
}
