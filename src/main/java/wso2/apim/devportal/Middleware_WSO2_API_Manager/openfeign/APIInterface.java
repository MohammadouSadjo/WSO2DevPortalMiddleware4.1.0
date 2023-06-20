package wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.API;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.APIList;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials.ClientCredentials;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials.ClientRegistrationDevPortal;

import java.util.List;

//@FeignClient(name="wso2apimapi", url = "https://localhost:9443/api/am/devportal/v2")
@FeignClient(name="wso2apimapi", url = "https://wso2db-test01.intra.bicec:9443/api/am/devportal/v2")
public interface APIInterface {

    @GetMapping(path = "/apis")
    APIList getAllAPIs();

    @GetMapping(path = "/apis/{apiId}")
    API getApiDetails(@PathVariable(value = "apiId") String apiId);

}
