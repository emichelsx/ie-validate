package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServicePITest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.PI.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.PI.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "573417598",
                "337188173",
                "511403488",
                "506413128",
                "533425956",
                "595395945",
                "370080157",
                "029496071",
                "069210551",
                "781825997");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "578417598",
                "338188173",
                "518403488",
                "508413128",
                "538425956",
                "598395945",
                "378080157",
                "028496071",
                "068210551",
                "788825997");
    }
}
