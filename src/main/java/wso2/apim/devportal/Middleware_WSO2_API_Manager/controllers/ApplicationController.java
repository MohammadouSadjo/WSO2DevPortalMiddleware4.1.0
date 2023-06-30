package wso2.apim.devportal.Middleware_WSO2_API_Manager.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Application.Application;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Application.ApplicationList;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken.AccessToken;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Subscription.Subscription;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Subscription.SubscriptionList;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign.ApplicationInterface;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign.SubscriptionInterface;

@AllArgsConstructor
@RestController
@RequestMapping("/application")
@CrossOrigin(origins = "*")
public class ApplicationController {

    @Autowired
    ApplicationInterface applicationInterface;

    @PostMapping("/all")
    public ApplicationList getAllApplications(@RequestParam(value = "query") String query, @RequestBody AccessToken accessToken){

        String authHeader = "Bearer " + accessToken.getAccess_token();

        System.out.println(authHeader);

        return applicationInterface.getAllApplications(query, authHeader);
    }

    @PostMapping("/{applicationId}")
    public Application getApplicationDetails(@PathVariable(value = "applicationId") String applicationId, @RequestBody AccessToken accessToken){

        String authHeader = "Bearer " + accessToken.getAccess_token();

        System.out.println(authHeader);

        return applicationInterface.getApplicationDetails(applicationId, authHeader);
    }
}
