import model.CustomMapForReadingXML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class InputOutputOperationOfXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(CustomMapForReadingXML.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CustomMapForReadingXML xmlMap = (CustomMapForReadingXML) unmarshaller.unmarshal(new File("src/javakeyswithdescription.xml"));
        System.out.println(xmlMap.getKeyWords().keySet().toString());
        //Printed all keys from XML file's Map
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(xmlMap,new File("javaKeyWordOutput.xml"));
        // writing xml value from java object into XML file
    }
}
