package br.com.michels.ievalidate;

import br.com.michels.ievalidate.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IeValidateApplication {

	public static void main(String[] args) {
		SpringApplication.run(IeValidateApplication.class, args);
	}

}
