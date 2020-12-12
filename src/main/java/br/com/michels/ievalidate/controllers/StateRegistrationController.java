package br.com.michels.ievalidate.controllers;

import br.com.michels.ievalidate.parameter.IEValidateParameter;
import br.com.michels.ievalidate.service.IEValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validate")
public class StateRegistrationController {

    @Autowired
    private IEValidateService ieValidateService;

    @ResponseBody
    @RequestMapping(
            value= "/state/{state}/state-registration/{stateRegistration}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity validate(@PathVariable String state, @PathVariable String stateRegistration){
        return ResponseEntity.ok(ieValidateService.validate(IEValidateParameter.builder()
                .state(state)
                .stateRegistration(stateRegistration)
                .build()));
    }

}
