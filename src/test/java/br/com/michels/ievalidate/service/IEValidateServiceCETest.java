package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceCETest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.CE.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.CE.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "794459773",
                "479800510",
                "737801980",
                "630807760",
                "476628741",
                "215471490",
                "649565347",
                "061826529",
                "110518985",
                "525371745");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "744459773",
                "469800510",
                "787801980",
                "670807760",
                "436628741",
                "225471490",
                "619565347",
                "051826529",
                "120518985",
                "585371745");
    }
}
