import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ReadZipFileInJava {
    public static void main(String[] args) throws IOException {
        ZipFile zipFile = new ZipFile("/home/mohan/Desktop/HelloWorldTech/src/main/resources/HelloWorld.zip");
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements())
        {
            ZipEntry zipEntry = entries.nextElement();
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while((line = bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
    }
}
