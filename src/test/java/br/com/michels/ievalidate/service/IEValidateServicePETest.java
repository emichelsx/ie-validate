package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServicePETest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.PE.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.PE.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "453288979",
                "977013782",
                "466295057",
                "733598404",
                "240904508",
                "358718813",
                "949891410",
                "598015655",
                "949151050",
                "690776306");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "413288979",
                "917013782",
                "416295057",
                "713598404",
                "210904508",
                "318718813",
                "919891410",
                "518015655",
                "919151050",
                "610776306");
    }
}
