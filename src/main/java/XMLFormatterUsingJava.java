import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class XMLFormatterUsingJava {

    private static String getFormattedXML(String xmlRaw) throws Exception {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance(); // creating instance of
        documentBuilderFactory.setValidating(false);
        Document document = documentBuilderFactory.newDocumentBuilder().parse(new InputSource(new StringReader(xmlRaw)));
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty("encoding", "UTF-8");
        transformer.setOutputProperty("indent", "yes");
        StringWriter stringWriter = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(stringWriter));
        String formatted = stringWriter.toString();
        return formatted;
    }

    public static void main(String[] args) throws Exception {
        String unFormattedXML ="<menu><one>item1</one><two>item2</two><three>item3</three></menu>";
        String formattedXML = getFormattedXML(unFormattedXML);
        System.out.println(formattedXML);
        //Writing formatted XML to a file
        FileWriter fileWriter = new FileWriter("formattedXML.xml");
        fileWriter.write(formattedXML);
        fileWriter.close(); // closing file writer stream
    }
}
