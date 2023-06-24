package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.APIDocument;

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
public class APIDocumentList {

    private int count;

    private List<APIDocument> list;

    private Pagination pagination;
}
