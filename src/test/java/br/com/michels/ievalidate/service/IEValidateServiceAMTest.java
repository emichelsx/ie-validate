package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceAMTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.AM.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.AM.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "915409682",
                "478325479",
                "104212896",
                "929457242",
                "597635935",
                "358425204",
                "705352595",
                "932396992",
                "178726915",
                "817606327");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "935409682",
                "458325479",
                "164212896",
                "959457242",
                "577635935",
                "378425204",
                "725352595",
                "942396992",
                "128726915",
                "887606327");
    }
}
