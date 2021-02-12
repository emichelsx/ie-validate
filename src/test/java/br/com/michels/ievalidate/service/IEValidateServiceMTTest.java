package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceMTTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.MT.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.MT.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "29244870118",
                "56996475341",
                "83266609956",
                "70153096447",
                "01363683664",
                "41423781410",
                "68632031343",
                "37179838708",
                "72648811520",
                "29874858869");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "29244570118",
                "56996675341",
                "83266709956",
                "70153896447",
                "01369683664",
                "41423881410",
                "68632131343",
                "37179238708",
                "72648411520",
                "29874958869");
    }
}
