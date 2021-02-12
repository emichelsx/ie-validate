package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * Run a single test class:
 * mvn -Dtest=IEValidateServiceDFTest test
 */
@SpringBootTest
public class IEValidateServiceDFTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.DF.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.DF.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "0780336400139",
                "0772908100177",
                "0732732800105",
                "0746779100142",
                "0759017800166",
                "0775680500193",
                "0786286700168",
                "0742153500182",
                "0794823100190",
                "0753022500109",
                "0743686000100",
                "0775781400100");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "0723110300120",
                "0722746600103",
                "0780366400139",
                "0772988100177",
                "0732722800105",
                "0721283700169",
                "0746789100142",
                "0759097800166",
                "0775600500193",
                "0722228300185",
                "0786246700168",
                "0742133500182",
                "0711075300187",
                "0703488800102",
                "0794893100190",
                "0750907800113",
                "0753002500109",
                "0743606000100",
                "0775711400100",
                "0715422900113");
    }
}
