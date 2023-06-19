package wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken.AccessToken;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials.ClientCredentials;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials.ClientRegistrationDevPortal;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken.RequestAccessTokenDevPortal;

@FeignClient(name="wso2apimauth", url = "https://localhost:9443")
public interface AuthenticationInterface {

    @PostMapping(path = "/client-registration/v0.17/register")
    ClientCredentials getClientCredentials(@RequestHeader(value = "Authorization", required = true) String authorizationHeader, @Validated @RequestBody ClientRegistrationDevPortal clientRegistrationDevPortal);

    @PostMapping(path = "/oauth2/token")
    AccessToken getAccessToken(@RequestHeader(value = "Authorization", required = true) String authorizationHeader, @Validated @RequestBody RequestAccessTokenDevPortal requestAccessTokenDevPortal);
}
