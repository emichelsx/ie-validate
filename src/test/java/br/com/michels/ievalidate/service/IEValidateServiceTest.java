package br.com.michels.ievalidate.service;

import br.com.michels.ievalidate.dto.IEValidationDTO;
import br.com.michels.ievalidate.parameter.IEValidateParameter;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class IEValidateServiceTest {

    public abstract List<String> validValues();

    public abstract List<String> invalidValues();

    public void ieValidTest(final IEValidateService service, final String state) {

        validValues().forEach(ie -> {

            final IEValidationDTO result = service.validate(IEValidateParameter.builder()
                    .state(state)
                    .stateRegistration(ie)
                    .build());

            assertTrue(result.isValid(), String.format("invalid ie %s, %s", state, ie));

        });
    }

    public void ieInvalidTest(final IEValidateService service, final String state) {

        invalidValues().forEach(ie -> {

            final IEValidationDTO result = service.validate(IEValidateParameter.builder()
                    .state(state)
                    .stateRegistration(ie)
                    .build());

            assertFalse(result.isValid(), String.format("valid ie %s, %s", state, ie));

        });

    }

}
