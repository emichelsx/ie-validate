package br.com.michels.ievalidate.service;

import br.com.caelum.stella.type.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class IEValidateServiceTOTest extends IEValidateServiceTest{

    @Autowired
    private IEValidateService service;

    @Test
    public void validIE(){
        super.ieValidTest(service, Estado.TO.name());
    }

    @Test
    public void invalidIE(){
        super.ieInvalidTest(service, Estado.TO.name());
    }

    @Override
    public List<String> validValues() {
        return Arrays.asList(
                "33032493890",
                "93030292570",
                "51032591407",
                "06036326230",
                "62039315914",
                "41031014595",
                "60033479146",
                "17034661533",
                "68037239524",
                "38038430753",
                "91035945495",
                "15030830459",
                "80031253500",
                "55031172509",
                "42036813383",
                "04037944250",
                "20031120160",
                "23030585868",
                "03039553850",
                "13035565596");
    }

    @Override
    public List<String> invalidValues() {
        return Arrays.asList(
                "33031493890",
                "93032292570",
                "51033591407",
                "06033326231",
                "62033315914",
                "41033014595",
                "60034479146",
                "17033661533",
                "68033239524",
                "38033430753",
                "91033945495",
                "15033830459",
                "80033253500",
                "55033172509",
                "42033813383",
                "04033944250",
                "20033120160",
                "23033585868",
                "03033553850",
                "13033565596");
    }
}
