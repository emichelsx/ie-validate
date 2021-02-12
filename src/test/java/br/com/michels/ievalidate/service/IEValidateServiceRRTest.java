package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceRRTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.RR.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.RR.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "247426431",
                "240154972",
                "247677612",
                "240958671",
                "245552812",
                "245365765",
                "248506063",
                "240981796",
                "244976556",
                "240908147",
                "248284622",
                "243981965",
                "241318122",
                "249332405",
                "245339114",
                "247606750",
                "244927662",
                "240997943",
                "249473854",
                "241226530",
                "240450960");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "241429432",
                "241154972",
                "241677618",
                "241958671",
                "241552813",
                "241365765",
                "241506063",
                "241981796",
                "241976557",
                "241450960");
    }
}
