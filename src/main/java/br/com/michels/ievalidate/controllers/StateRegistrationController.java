package br.com.michels.ievalidate.controllers;

import br.com.michels.ievalidate.parameter.IEValidateParameter;
import br.com.michels.ievalidate.service.ControlledCacheService;
import br.com.michels.ievalidate.service.IEValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/validate")
public class StateRegistrationController {

    @Autowired
    private IEValidateService ieValidateService;

    @Autowired
    private ControlledCacheService cache;

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


    @ResponseBody
    @RequestMapping(
            value= "/state/{state}/state-registration/{stateRegistration}/test",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity getCache(@PathVariable String state, @PathVariable String stateRegistration){
        String param = state + "_" + stateRegistration;
        String fromCache = cache.getFromCache(param);
        if (fromCache == null) {
            String newValue = cache.populateCache(param, UUID.randomUUID().toString());
            return ResponseEntity.ok(newValue);
        }
        return ResponseEntity.ok(fromCache);
    }







}
