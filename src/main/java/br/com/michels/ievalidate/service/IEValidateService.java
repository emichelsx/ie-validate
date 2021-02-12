package br.com.michels.ievalidate.service;

import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.MessageProducer;
import br.com.caelum.stella.ResourceBundleMessageProducer;
import br.com.caelum.stella.type.Estado;
import br.com.caelum.stella.validation.Validator;
import br.com.michels.ievalidate.dto.ErrorDTO;
import br.com.michels.ievalidate.dto.IEValidationDTO;
import br.com.michels.ievalidate.parameter.IEValidateParameter;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

@Service
public class IEValidateService {

    private MessageProducer messageProducer;

    private static final String LANG = "locale.lang";
    private static final String COUNTRY = "locale.country";

    @Inject
    public IEValidateService(Environment env){
        final ResourceBundle resourceBundle = ResourceBundle.getBundle(
                "IEValidation",
                new Locale(env.getProperty(LANG), env.getProperty(COUNTRY)));
        this.messageProducer = new ResourceBundleMessageProducer(resourceBundle);
    }

    public IEValidationDTO validate(IEValidateParameter parameter){
        final IEValidationDTO.IEValidationDTOBuilder builder = IEValidationDTO.builder()
                .state(parameter.getState())
                .stateRegistration(parameter.getStateRegistration());
        try {
            final Estado estado = Estado.valueOf(parameter.getState());
            final Validator<String> validator = estado.getIEValidator(this.messageProducer, false);
            validator.assertValid(parameter.getStateRegistration());
            builder.valid(Boolean.TRUE);
        } catch (InvalidStateException e){
            builder.errors(Arrays.asList(new ErrorDTO((e.getMessage()))));
            builder.valid(Boolean.FALSE);
        } catch (IllegalArgumentException e){
            final ErrorDTO error = new ErrorDTO(String.format("%s status is not supported. Supported states are %s",
                    parameter.getState(),
                    (Arrays.asList(Estado.values())).stream()
                            .map(estado -> estado.name())
                            .collect(Collectors.joining(","))));
            builder.errors(Arrays.asList(error));
            builder.valid(Boolean.FALSE);
        }
        return builder.build();
    }

}
