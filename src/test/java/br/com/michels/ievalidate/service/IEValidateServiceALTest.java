package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceALTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.AL.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.AL.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "248554387",
                "248381806",
                "248038478",
                "248943162",
                "248578405",
                "248860356",
                "248317571",
                "248758594",
                "248339583",
                "248697145");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "228554387",
                "208381806",
                "2289892610",
                "268943162",
                "278578405",
                "2684089510",
                "278317571",
                "288758594",
                "298339583",
                "208697145");
    }
}
