package wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.API;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.Rating;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.RatingList;

@FeignClient(name="wso2apimrating", url = "https://localhost:9443/api/am/devportal/v2")
public interface RatingInterface {

    @GetMapping(path = "/apis/{apiId}/ratings")
    RatingList getApiRatings(@PathVariable(value = "apiId") String apiId);

    @GetMapping(path = "/apis/{apiId}/user-rating")
    Rating getApiRatingofUser(@PathVariable(value = "apiId") String apiId, @RequestHeader(value = "Authorization", required = true) String authorizationHeader);


}
