package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceROTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.RO.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.RO.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "86504874657699",
                "17262142753853",
                "96478034050723",
                "73712313295219",
                "75173323761292",
                "31594792317211",
                "00807534254690",
                "55456842988247",
                "62925965500897",
                "25591405407787");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "86514874657699",
                "17212142753853",
                "96418034050723",
                "73732313295219",
                "75113323761292",
                "31514792317211",
                "00817534254690",
                "55416842988247",
                "62915965500897",
                "25511405407787");
    }
}
