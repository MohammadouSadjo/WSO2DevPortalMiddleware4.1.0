package wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.API;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.APIList;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.APIDocument.APIDocument;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.APIDocument.APIDocumentList;

@FeignClient(name="wso2apimapidocument", url = "https://localhost:9443/api/am/devportal/v2")
public interface APIDocumentInterface {

    @GetMapping(path = "/apis/{apiId}/documents")
    APIDocumentList getAllDocumentsofAPI(@PathVariable(value = "apiId") String apiId);

    @GetMapping(path = "/apis/{apiId}/documents/{documentId}")
    APIDocument getAPIDocument(@PathVariable(value = "apiId") String apiId, @PathVariable(value = "documentId") String documentId);

    @GetMapping(path = "/apis/{apiId}/documents/{documentId}/content")
    String getContentAPIDocument(@PathVariable(value = "apiId") String apiId, @PathVariable(value = "documentId") String documentId);
}
