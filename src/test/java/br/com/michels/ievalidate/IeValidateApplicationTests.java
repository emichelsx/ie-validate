package br.com.michels.ievalidate;

import br.com.michels.ievalidate.controllers.StateRegistrationController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class IeValidateApplicationTests {

	@Autowired
	private StateRegistrationController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
