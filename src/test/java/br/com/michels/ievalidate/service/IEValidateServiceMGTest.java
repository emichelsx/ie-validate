package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceMGTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.MG.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.MG.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "7878539384953",
                "1071202226016",
                "1788357722746",
                "6745008900790",
                "1610186367828",
                "9689941727737",
                "2352505838509",
                "6043177121072",
                "2179021008656",
                "0035699870245");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "7878530384953",
                "1071200226016",
                "1788350722746",
                "6745000900790",
                "1610180367828",
                "9689940727737",
                "2352500838509",
                "6043170121072",
                "2179020008656",
                "0035690870245");
    }
}
