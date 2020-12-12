package br.com.michels.ievalidate.dto;

import lombok.Builder;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Builder
@ToString
public class IEValidationDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String state;
    private String stateRegistration;
    private boolean valid;
    private List<ErrorDTO> errors;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public List<ErrorDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDTO> errors) {
        this.errors = errors;
    }
}
