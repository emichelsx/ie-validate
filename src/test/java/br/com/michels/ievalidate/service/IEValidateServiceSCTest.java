package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceSCTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.SC.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.SC.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "550149899",
                "127131981",
                "300873212",
                "455234485",
                "897255321",
                "803993544",
                "111633648",
                "599847727",
                "221107223",
                "808855204",
                "024178870",
                "141727810",
                "267519290",
                "536261040",
                "675746710",
                "160375436",
                "804870217",
                "401911195",
                "762145978",
                "114570736");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "551149899",
                "121131981",
                "301873212",
                "451234485",
                "891255321",
                "801993544",
                "112633648",
                "592847727",
                "222107223",
                "112570736");
    }
}
