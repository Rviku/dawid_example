package pl.rvik.dawid;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import pl.rvik.dawid.pojo.YourObjectWithId;

/**
 * @author Rvik
 */
@Slf4j
public class Dawid {
    public static void main (String[] args) throws JsonProcessingException {

        YourObjectWithId yourObjectWithId = new YourObjectWithId();
        yourObjectWithId.setExternalId("dawidaId");
        yourObjectWithId.setExternalId2(12334);

        log.info("Json example");
        ObjectMapper objectMapper = new ObjectMapper();
        String string = objectMapper.writeValueAsString(yourObjectWithId);
        log.info(string);

        log.info("Xml example");
        XmlMapper xmlMapper = new XmlMapper();
        String string1 = xmlMapper.writeValueAsString(yourObjectWithId);
        log.info(string1);
    }
}
