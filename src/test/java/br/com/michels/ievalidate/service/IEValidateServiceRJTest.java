package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceRJTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.RJ.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.RJ.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "38968521",
                "47738750",
                "46873653",
                "61238220",
                "88878701",
                "85536044",
                "39353431",
                "82581685",
                "09753206",
                "33023871");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "28968521",
                "37738750",
                "36873653",
                "71238220",
                "38878701",
                "35536044",
                "59353431",
                "22581685",
                "29753206",
                "13023871");
    }
}
