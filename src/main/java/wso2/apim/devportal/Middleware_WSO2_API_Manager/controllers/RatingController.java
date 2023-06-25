package wso2.apim.devportal.Middleware_WSO2_API_Manager.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.API;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken.AccessToken;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken.RequestAccessToken;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken.RequestAccessTokenDevPortal;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.AddUpdateRating;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.AddUpdateRatingDevPortal;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.Rating;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating.RatingList;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign.RatingInterface;

@AllArgsConstructor
@RestController
@RequestMapping("/rating")
@CrossOrigin(origins = "*")
public class RatingController {

    @Autowired
    RatingInterface ratingInterface;

    @GetMapping("/{apiId}/all")
    public RatingList getAPIRatings(@PathVariable(value = "apiId") String apiId){
        return ratingInterface.getApiRatings(apiId);
    }

    @GetMapping("/{apiId}/user-rating")
    public Rating getAPIRatings(@PathVariable(value = "apiId") String apiId, @RequestBody AccessToken accessToken){

        String authHeader = "Bearer " + accessToken.getAccess_token();

        System.out.println(authHeader);

        return ratingInterface.getApiRatingofUser(apiId, authHeader);
    }

    @PutMapping("/{apiId}/user-rating")
    public Rating AddOrUpdateApiRatingofUser(@PathVariable(value = "apiId") String apiId, @RequestBody AddUpdateRatingDevPortal addUpdateRatingDevPortal){

        String authHeader = "Bearer " + addUpdateRatingDevPortal.getAccess_token();

        AddUpdateRating addUpdateRating = new AddUpdateRating();
        addUpdateRating.setRating(addUpdateRatingDevPortal.getRating());


        return ratingInterface.addOrUpdateApiRatingofUser(apiId, authHeader, addUpdateRating);
    }

    @DeleteMapping("/{apiId}/user-rating")
    public void DeleteApiRatingofUser(@PathVariable(value = "apiId") String apiId, @RequestBody AccessToken accessToken){

        String authHeader = "Bearer " + accessToken.getAccess_token();

        ratingInterface.deleteApiRatingofUser(apiId, authHeader);
    }
}
