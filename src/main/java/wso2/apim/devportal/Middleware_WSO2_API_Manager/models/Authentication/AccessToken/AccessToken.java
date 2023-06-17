package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.AccessToken;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccessToken {

    private String access_token;
    private String refresh_token;
    private String scope;
    private String token_type;
    private Long expires_in;
}
