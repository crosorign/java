import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;

public class CrawlWebsiteUsingJsoup {

    public static void main(String[] args) throws Exception {
        Document document = Jsoup.connect("https://en.wikipedia.org/wiki/Main_Page").get();
        Elements elements = document.getAllElements();
        FileWriter fileWriter = new FileWriter("Output.html");
        for (Element element : elements) {
            fileWriter.write(element.toString());
        }
        fileWriter.close();
    }
}
