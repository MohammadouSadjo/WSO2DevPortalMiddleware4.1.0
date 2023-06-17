package wso2.apim.devportal.Middleware_WSO2_API_Manager.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken.AccessToken;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken.RequestAccessToken;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken.RequestAccessTokenDevPortal;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials.ClientCredentials;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials.ClientRegistration;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials.ClientRegistrationDevPortal;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign.AuthenticationInterface;

@AllArgsConstructor
@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthenticationController {

    @Autowired
    AuthenticationInterface authenticationInterface;

    @PostMapping("/client-registration")
    public ClientCredentials getClientCredentials(@Validated @RequestBody ClientRegistration clientRegistration) {

        String username = clientRegistration.getUsername();
        String password = clientRegistration.getPassword();

        ClientRegistrationDevPortal clientRegistrationDevPortal = new ClientRegistrationDevPortal();

        clientRegistrationDevPortal.setClientName(clientRegistration.getClientName());
        clientRegistrationDevPortal.setCallbackUrl(clientRegistration.getCallbackUrl());
        clientRegistrationDevPortal.setGrantType(clientRegistration.getGrantType());
        clientRegistrationDevPortal.setOwner(clientRegistration.getOwner());
        clientRegistrationDevPortal.setSaasApp(clientRegistration.getSaasApp());

        byte[] encodedBytes = Base64Utils.encode((username + ":" + password).getBytes());

        String authHeader = "Basic " + new String(encodedBytes);

        return authenticationInterface.getClientCredentials(authHeader, clientRegistrationDevPortal);
    }

    @PostMapping("/access-token")
    public AccessToken getAccessToken(@Validated @RequestBody RequestAccessToken requestAccessToken) {

        String client_id = requestAccessToken.getClient_id();
        String client_secret = requestAccessToken.getClient_secret();

        RequestAccessTokenDevPortal requestAccessTokenDevPortal = new RequestAccessTokenDevPortal();

        requestAccessTokenDevPortal.setGrant_type(requestAccessToken.getGrant_type());
        requestAccessTokenDevPortal.setPassword(requestAccessToken.getPassword());
        requestAccessTokenDevPortal.setScope(requestAccessToken.getScope());
        requestAccessTokenDevPortal.setUsername(requestAccessToken.getUsername());

        byte[] encodedBytes = Base64Utils.encode((client_id + ":" + client_secret).getBytes());

        String authHeader = "Basic " + new String(encodedBytes);

        return authenticationInterface.getAccessToken(authHeader, requestAccessTokenDevPortal);
    }
}
