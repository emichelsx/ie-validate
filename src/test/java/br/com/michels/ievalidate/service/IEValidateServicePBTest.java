package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServicePBTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.PB.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.PB.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "702226572",
                "840489838",
                "056171790",
                "223865133",
                "128788615",
                "355936976",
                "215572890",
                "384646492",
                "173648681",
                "689694040");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "702236572",
                "840449838",
                "056161790",
                "223875133",
                "128778615",
                "355976976",
                "215582890",
                "384696492",
                "173618681",
                "689604040");
    }
}
