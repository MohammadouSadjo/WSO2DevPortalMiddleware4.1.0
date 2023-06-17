package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientRegistrationDevPortal {

    private String callbackUrl;

    private String clientName;

    private String owner;

    private String grantType;

    private Boolean saasApp;
}
