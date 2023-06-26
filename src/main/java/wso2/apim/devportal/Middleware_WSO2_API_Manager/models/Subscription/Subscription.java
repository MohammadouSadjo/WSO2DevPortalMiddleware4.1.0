package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Subscription;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.API;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Application.Application;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {

    private String subscriptionId;

    private String applicationId;

    private String apiId;

    private API apiInfo;

    private Application applicationInfo;

    private String throttlingPolicy;

    private String requestedThrottlingPolicy;

    private String status;

    private String redirectionParams;
}
