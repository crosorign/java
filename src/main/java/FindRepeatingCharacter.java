public class FindRepeatingCharacter {
    static int hashSlot[];
    public static void main(String[] args) {
        String string = "crosorigincrosorigin.. 12345123";
        printRepeatingCharacters(string);
    }
    // cginors - repeated characters are printed in alphabetic order
    private static void printRepeatingCharacters(String string) {
        hashSlot= new int[1000];
        for(char c:string.toCharArray())
        {
            hashSlot[c]+=1;
        }
        for(int i=0;i<hashSlot.length;i++)
        {
            if(hashSlot[i]>1) {
                System.out.print(Character.toChars(i));
            }
        }
    }
}
