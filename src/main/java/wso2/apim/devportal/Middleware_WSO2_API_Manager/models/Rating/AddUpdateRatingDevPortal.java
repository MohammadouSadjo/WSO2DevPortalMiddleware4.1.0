package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Rating;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddUpdateRatingDevPortal {

    private int rating;

    private String access_token;
}

