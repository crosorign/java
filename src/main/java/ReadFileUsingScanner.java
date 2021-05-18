import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileUsingScanner {
    public static void main(String[] args) throws FileNotFoundException {
        // Create file object using absolute path
        File file = new File("/home/mohan/Desktop/HelloWorldTech/src/main/resources/HelloWorld.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }


    }
}
