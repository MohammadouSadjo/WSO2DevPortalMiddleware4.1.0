package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.APIDocument;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIDocument {

    private String documentId;

    private String name;

    private String type;

    private String summary;

    private String sourceType;

    private String sourceUrl;

    private String otherTypeName;


}
