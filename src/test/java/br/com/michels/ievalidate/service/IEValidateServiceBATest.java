package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceBATest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.BA.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.BA.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "13883818",
                "06428190",
                "26753674",
                "00350291",
                "42410036",
                "48058492",
                "96908599",
                "72633363",
                "52517181",
                "37007634");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "12883818",
                "03428190",
                "27753674",
                "01350291",
                "46410036",
                "49058492",
                "93908599",
                "71633363",
                "57517181",
                "38007634");
    }
}
