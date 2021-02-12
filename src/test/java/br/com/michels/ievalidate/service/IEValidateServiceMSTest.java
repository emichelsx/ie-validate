package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceMSTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.MS.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.MS.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "281514976",
                "285980017",
                "285047825",
                "288972210",
                "283134372",
                "280325142",
                "281763135",
                "281114927",
                "280342870",
                "283608854");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "281517976",
                "285988017",
                "285048825",
                "288979210",
                "283139372",
                "280323142",
                "281762135",
                "281111927",
                "280341870",
                "283600854");
    }
}
