package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServicePATest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.PA.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.PA.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "151356580",
                "158400887",
                "156024640",
                "157943780",
                "158447174",
                "152348077",
                "151940169",
                "158168615",
                "156910209",
                "157047822");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "151351580",
                "158402887",
                "156023640",
                "157945780",
                "158446174",
                "152347077",
                "151947169",
                "158167615",
                "156917209",
                "157047823");
    }
}
