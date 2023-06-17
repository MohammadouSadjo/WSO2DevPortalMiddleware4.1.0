package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestAccessToken {

    private String grant_type;

    private String username;

    private String password;

    private String scope;

    private String client_id;

    private String client_secret;
}
