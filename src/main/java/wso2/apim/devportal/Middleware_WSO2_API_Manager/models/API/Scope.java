package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Scope {

    private String key;

    private String name;

    private List<String> roles;

    private String description;
}
