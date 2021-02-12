package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceMATest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.MA.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.MA.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "129587648",
                "129718947",
                "128349018",
                "129787450",
                "126220557",
                "120206820",
                "129889296",
                "124827322",
                "122330331",
                "123612799");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "129597648",
                "139728947",
                "148309018",
                "169787450",
                "176220557",
                "180206820",
                "199889296",
                "124927322",
                "122300331",
                "123512799");
    }
}
