package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceESTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.ES.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.ES.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "266916074",
                "099564424",
                "147433401",
                "568578627",
                "804810915",
                "826077781",
                "243167431",
                "244754268",
                "101719876",
                "819682900");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "264916074",
                "095564424",
                "143433401",
                "562578627",
                "801810915",
                "828077781",
                "249167431",
                "240754268",
                "103719876",
                "816682900");
    }
}
