package wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.API;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.AddUpdateRating;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.Rating;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.RatingList;

@FeignClient(name="wso2apimrating", url = "https://localhost:9443/api/am/devportal/v2")
public interface RatingInterface {

    @GetMapping(path = "/apis/{apiId}/ratings")
    RatingList getApiRatings(@PathVariable(value = "apiId") String apiId);

    @GetMapping(path = "/apis/{apiId}/user-rating")
    Rating getApiRatingofUser(@PathVariable(value = "apiId") String apiId, @RequestHeader(value = "Authorization", required = true) String authorizationHeader);

    @PutMapping(path = "/apis/{apiId}/user-rating")
    Rating addOrUpdateApiRatingofUser(@PathVariable(value = "apiId") String apiId, @RequestHeader(value = "Authorization", required = true) String authorizationHeader, @Validated @RequestBody AddUpdateRating addUpdateRating);

    @DeleteMapping(path = "/apis/{apiId}/user-rating")
    void deleteApiRatingofUser(@PathVariable(value = "apiId") String apiId, @RequestHeader(value = "Authorization", required = true) String authorizationHeader);


}
