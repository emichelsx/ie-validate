package br.com.michels.ievalidate.parameter;

import lombok.Getter;
import lombok.ToString;

import java.util.Optional;

@Getter
@ToString
public class IEValidateParameter {

    private String state;
    private String stateRegistration;

    private IEValidateParameter(){}

    public IEValidateParameter(String state, String stateRegistration) {
        this.state = state;
        this.stateRegistration = stateRegistration;
    }

    public static IEValidateParameter.IEValidateParameterBuilder builder(){
        return new IEValidateParameter.IEValidateParameterBuilder();
    }

    public static class IEValidateParameterBuilder {

        private String state;
        private String stateRegistration;

        public IEValidateParameter.IEValidateParameterBuilder state(String state){
            this.state = state;
            return this;
        }

        public IEValidateParameter.IEValidateParameterBuilder stateRegistration(String stateRegistration){
            this.stateRegistration = stateRegistration;
            return this;
        }

        public IEValidateParameter build(){
            this.state = Optional.ofNullable(this.state)
                    .map(String::toUpperCase)
                    .orElseThrow(() -> new IllegalArgumentException("state cant be null or empty"));
            this.stateRegistration = Optional.ofNullable(this.stateRegistration)
                    .map(value -> value.replaceAll("[^\\d]", ""))
                    .orElseThrow(() -> new IllegalArgumentException("stateRegistration cant be null or empty"));
            return new IEValidateParameter(state, stateRegistration);
        }

    }

}
