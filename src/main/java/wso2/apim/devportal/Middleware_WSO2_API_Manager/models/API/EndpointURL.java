package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EndpointURL {

    private String environmentName;

    private String environmentDisplayName;

    private String environmentType;

    private URLs URLs;

    private DefaultVersionURLs defaultVersionURLs;
}
