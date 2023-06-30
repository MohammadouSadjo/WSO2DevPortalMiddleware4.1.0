package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.Pagination;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationList {

    private int count;

    private List<Application> list;

    private Pagination pagination;
}
