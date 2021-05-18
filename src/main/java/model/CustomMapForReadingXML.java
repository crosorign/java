package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

@XmlRootElement(name = "java")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomMapForReadingXML {
    private Map<String,String> keyWords;

    public Map<String, String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(Map<String, String> keyWords) {
        this.keyWords = keyWords;
    }
}
