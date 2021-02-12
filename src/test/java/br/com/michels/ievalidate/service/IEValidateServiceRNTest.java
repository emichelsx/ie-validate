package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceRNTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.RN.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.RN.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "205246508",
                "206005857",
                "202436063",
                "200307754",
                "204948991",
                "202795683",
                "208666753",
                "209198257",
                "200748980",
                "203623207");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "205216508",
                "206025857",
                "202416063",
                "200327754",
                "204918991",
                "202725683",
                "208616753",
                "209128257",
                "200718980",
                "203633207");
    }
}
