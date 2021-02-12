package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceRSTest extends IEValidateServiceTest {

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.RS.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.RS.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "2120296736",
                "4138151175",
                "0289812496",
                "4457062170",
                "3292984809",
                "4190277460",
                "0876248113",
                "2101408770",
                "3264598940",
                "4258107017");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "8613564727",
                "2110296736",
                "4118151175",
                "0219812496",
                "4417062170",
                "6915509514",
                "9617344600",
                "3212984809",
                "8413556863",
                "5419427659",
                "7411738083",
                "5917844043",
                "4110277460",
                "0816248113",
                "2181408770",
                "5812670240",
                "3214598940",
                "4218107017");
    }
}
