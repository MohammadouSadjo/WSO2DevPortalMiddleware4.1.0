package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DefaultVersionURLs {

    private String http;

    private String https;

    private String ws;

    private String wss;
}
