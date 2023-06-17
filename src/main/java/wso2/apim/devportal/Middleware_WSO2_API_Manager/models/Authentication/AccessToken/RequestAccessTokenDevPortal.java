package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestAccessTokenDevPortal {

    private String grant_type;

    private String username;

    private String password;

    private String scope;
}
