package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceGOTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.GO.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.GO.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "159663113",
                "109780230",
                "115268901",
                "154533335",
                "153499028",
                "158928121",
                "115112642",
                "115759310",
                "152370986",
                "154073024",
                "115787712",
                "116971851",
                "153813512",
                "116934409",
                "119401843",
                "157902420",
                "154779180",
                "116816864",
                "114233349",
                "156509814");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "159763113",
                "109880230",
                "115968901",
                "154333335",
                "153299028",
                "158128121",
                "115001264",
                "112759310",
                "155370986",
                "157073024",
                "118787712",
                "119971851",
                "151813512",
                "112934409",
                "112401843",
                "152902420",
                "152779180",
                "112816864",
                "112233349",
                "152509814");
    }
}
