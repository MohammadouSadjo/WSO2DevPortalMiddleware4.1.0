package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Application {

    private String applicationId;

    private String name;

    private String throttlingPolicy;

    private String description;

    private String status;

    //private String groups;

    //private String attributes;

    private int subscriptionCount;

    private String owner;
}
