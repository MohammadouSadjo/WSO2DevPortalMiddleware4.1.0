package wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Application.Application;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Application.ApplicationList;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Subscription.Subscription;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Subscription.SubscriptionList;

@FeignClient(name="wso2apimapplication", url = "https://localhost:9443/api/am/devportal/v2")
public interface ApplicationInterface {

    @GetMapping(path = "/applications")
    ApplicationList getAllApplications(@RequestParam(value = "query") String query, @RequestHeader(value = "Authorization", required = true) String authorizationHeader);

    @GetMapping(path = "/applications/{applicationId}")
    Application getApplicationDetails(@PathVariable(value = "applicationId") String applicationId, @RequestHeader(value = "Authorization", required = true) String authorizationHeader);

}
