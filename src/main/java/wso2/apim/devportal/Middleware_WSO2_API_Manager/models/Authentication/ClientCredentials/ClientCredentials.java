package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Authentication.ClientCredentials;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientCredentials {

    private String clientId;

    private String clientName;

    private String callBackURL;

    private String clientSecret;

    private Boolean isSaasApplication;

    private String appOwner;

    private String jsonString;

    private String jsonAppAttribute;


}
