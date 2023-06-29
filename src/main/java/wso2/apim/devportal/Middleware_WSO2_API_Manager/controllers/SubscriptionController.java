package wso2.apim.devportal.Middleware_WSO2_API_Manager.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken.AccessToken;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.Rating;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Subscription.Subscription;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Subscription.SubscriptionList;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign.SubscriptionInterface;

@AllArgsConstructor
@RestController
@RequestMapping("/subscription")
@CrossOrigin(origins = "*")
public class SubscriptionController {

    @Autowired
    SubscriptionInterface subscriptionInterface;

    @PostMapping("/all")
    public SubscriptionList getAllSubscriptions(@RequestParam(value = "apiId") String apiId, @RequestBody AccessToken accessToken){

        String authHeader = "Bearer " + accessToken.getAccess_token();

        System.out.println(authHeader);

        return subscriptionInterface.getAllSubscriptions(apiId, authHeader);
    }

    @PostMapping("/{subscriptionId}")
    public Subscription getSubscriptionDetails(@PathVariable(value = "subscriptionId") String subscriptionId, @RequestBody AccessToken accessToken){

        String authHeader = "Bearer " + accessToken.getAccess_token();

        System.out.println(authHeader);

        return subscriptionInterface.getSubscriptionDetails(subscriptionId, authHeader);
    }
}
