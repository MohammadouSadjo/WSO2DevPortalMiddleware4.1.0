package wso2.apim.devportal.Middleware_WSO2_API_Manager.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.APIList;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials.ClientCredentials;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials.ClientRegistration;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials.ClientRegistrationDevPortal;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign.APIInterface;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class APIController {

    @Autowired
    APIInterface apiInterface;

    @GetMapping("/all")
    public APIList getAllAPIs() {

        return apiInterface.getAllAPIs();
    }
}
