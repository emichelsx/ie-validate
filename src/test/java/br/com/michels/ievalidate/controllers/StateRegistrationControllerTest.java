package br.com.michels.ievalidate.controllers;

import br.com.michels.ievalidate.dto.IEValidationDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.not;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StateRegistrationControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void ieValid() throws Exception {
        final String url = "http://localhost:" + port + "/validate/state/SP/state-registration/762915987348";
        final IEValidationDTO response = this.restTemplate.getForObject(url, IEValidationDTO.class);
        assertThat(Optional.ofNullable(response).isPresent());
        not(Optional.ofNullable(response.getErrors()).isPresent());
        assertThat(response.getState().equals("SP"));
        assertThat(response.getStateRegistration().equals("762915987348"));
        assertThat(response.isValid());
    }

    @Test
    public void ieValidateNotValid() throws Exception {
        final String url = "http://localhost:" + port + "/validate/state/MG/state-registration/762915987348";
        final IEValidationDTO response = this.restTemplate.getForObject(url, IEValidationDTO.class);
        assertThat(Optional.ofNullable(response).isPresent());
        not(Optional.ofNullable(response.getErrors()).isPresent());
        assertThat(response.getState().equals("MG"));
        assertThat(response.getStateRegistration().equals("762915987348"));
        assertThat(Optional.ofNullable(response.getErrors()).isPresent());
        not(response.isValid());
    }

    @Test
    public void ieValidateStateInvalid() throws Exception {
        final String url = "http://localhost:" + port + "/validate/state/XX/state-registration/762915987348";
        final IEValidationDTO response = this.restTemplate.getForObject(url, IEValidationDTO.class);
        assertThat(Optional.ofNullable(response).isPresent());
        assertThat(Optional.ofNullable(response.getErrors()).isPresent());
        not(response.isValid());
        assertThat(Optional.ofNullable(response.getErrors()).map(errorDTOS -> errorDTOS.stream().findFirst()
                .filter(error -> error.getMessage().contains("XX status is not supported."))
                .isPresent()));
    }

}
