package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceSETest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.SE.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.SE.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "599357754",
                "993480497",
                "732033578",
                "073338362",
                "042376963",
                "837338824",
                "030019591",
                "259021440",
                "253973422",
                "507107950",
                "860684938",
                "623998793",
                "270510435",
                "541191918",
                "723462224",
                "346495970",
                "935564365",
                "209495057",
                "066661595",
                "680109668");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "591357754",
                "991480497",
                "731033578",
                "071338362",
                "041376963",
                "831338824",
                "031019591",
                "251973422",
                "501107950",
                "861684938",
                "621998793",
                "271510435",
                "542191918",
                "721462224",
                "341495970",
                "931564365",
                "201495057", //falso
                "061661595",
                "689109668");
    }
}
