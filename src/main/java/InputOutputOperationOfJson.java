import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class InputOutputOperationOfJson {
    public static void main(String[] args) throws Exception {
        Map<String, String> javaKeyValueMap = new HashMap<String, String>();
        ObjectMapper objectMapper = new ObjectMapper();
        // Reading JSON file
        javaKeyValueMap = objectMapper.readValue(new File("src/javakeyswithdescription.json"), Map.class);
        System.out.println("Printing all keywords read from JSON file");
        System.out.println(javaKeyValueMap.keySet());
        System.out.println("creating file with Java keys read from JSON file");
        // Writing to JSON file
        FileWriter fileWriter = new FileWriter("javakeys.json");
        fileWriter.write(objectMapper.writeValueAsString(javaKeyValueMap.keySet()));
        fileWriter.close();
    }
}
