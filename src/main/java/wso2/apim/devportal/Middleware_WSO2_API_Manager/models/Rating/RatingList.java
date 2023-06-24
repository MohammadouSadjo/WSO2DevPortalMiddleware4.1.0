package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.Pagination;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RatingList {

    private String avgRating;

    private int userRating;

    private int count;

    private List<Rating> list;

    private Pagination pagination;
}
