package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceAPTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.AP.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.AP.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "031484280",
                "033328935",
                "035784857",
                "030173177",
                "033153230",
                "036957739",
                "039859274",
                "035001500",
                "034572309",
                "032883978");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "031384280",
                "033428935",
                "0376645911",
                "030773177",
                "033853230",
                "036057739",
                "039259274",
                "035401500",
                "034672309",
                "032483978");
    }
}
