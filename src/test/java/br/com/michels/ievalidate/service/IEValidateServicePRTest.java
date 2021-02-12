package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServicePRTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.PR.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.PR.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "0036886900",
                "4944551617",
                "6211772814",
                "2221627698",
                "5955953551",
                "4999822830",
                "5741308918",
                "5091959609",
                "9855181654",
                "4742170271");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "0036816900",
                "4944521617",
                "6211712814",
                "2221637698",
                "5955943551",
                "4999852830",
                "5741368918",
                "5091989609",
                "9855191654",
                "4742100271");
    }
}
