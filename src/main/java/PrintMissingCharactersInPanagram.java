public class PrintMissingCharactersInPanagram {

    static boolean[] charHash = new boolean[26];// max 26 alphabet

    public static void main(String[] args) {
        String sentence = "aeiou has all vowels but not alphabets";
        printMissingCharacters(sentence);
        String sentence2 = "ABCefhgijklmnopqrstuvwxy";
        System.out.println();
        printMissingCharacters(sentence2);
    }
    // autoboxing happens and character's ASCII value is used for comparision
    private static void printMissingCharacters(String sentence) {
        charHash = new boolean[26];
        for (char c : sentence.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                charHash[c - 'A'] = true;
            } else if (c >= 'a' && c <= 'z') {
                charHash[c - 'a'] = true;
            }
        }
        for (int i = 0; i < charHash.length; i++) {
            if (!charHash[i]) {
                System.out.print(Character.valueOf((char) ((char) i+'a')));
            }
        }
    }

}
