package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceACTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.AC.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.AC.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "0114804080123",
                "0129936044750",
                "0185492395131",
                "0112798150726",
                "0172012842137",
                "0188761457674",
                "0171915075844",
                "0186959082119",
                "0142270238621",
                "0114061293268");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "0115804080123",
                "0126936044750",
                "0187492395131",
                "0118798150726",
                "0179012842137",
                "0180761457674",
                "0172915075844",
                "0184959082119",
                "0141270238621",
                "0119061293268");
    }
}
