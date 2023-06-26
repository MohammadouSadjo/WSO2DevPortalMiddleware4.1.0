package wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.Rating;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Subscription.Subscription;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Subscription.SubscriptionList;

@FeignClient(name="wso2apimsubscription", url = "https://localhost:9443/api/am/devportal/v2")
public interface SubscriptionInterface {

    @GetMapping(path = "/subscriptions")
    SubscriptionList getAllSubscriptions(@RequestParam(value = "apiId") String apiId, @RequestHeader(value = "Authorization", required = true) String authorizationHeader);

    @GetMapping(path = "/subscriptions/{subscriptionId}")
    Subscription getSubscriptionDetails(@PathVariable(value = "subscriptionId") String apiId, @RequestHeader(value = "Authorization", required = true) String authorizationHeader);
}
