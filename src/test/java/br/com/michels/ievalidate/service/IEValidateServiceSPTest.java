package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceSPTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.SP.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.SP.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "638075360566",
                "945048604601",
                "235222215510",
                "057025076581",
                "212071512233",
                "209958788506",
                "686307123360",
                "346215590065",
                "963347089462",
                "950869630809");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "638075360545",
                "945048604645",
                "235222215548",
                "057025076545",
                "212071512246",
                "209958788545",
                "686307123345",
                "346215590045",
                "963347089445",
                "950869630845");
    }
}
