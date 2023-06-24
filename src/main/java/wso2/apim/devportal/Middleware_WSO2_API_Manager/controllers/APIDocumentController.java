package wso2.apim.devportal.Middleware_WSO2_API_Manager.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.API;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API.APIList;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.APIDocument.APIDocument;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.models.APIDocument.APIDocumentList;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign.APIDocumentInterface;
import wso2.apim.devportal.Middleware_WSO2_API_Manager.openfeign.APIInterface;

@AllArgsConstructor
@RestController
@RequestMapping("/apidocument")
@CrossOrigin(origins = "*")
public class APIDocumentController {

    @Autowired
    APIDocumentInterface apiDocumentInterface;

    @GetMapping("/all/{apiId}")
    public APIDocumentList getAllDocumentsofAPI(@PathVariable(value = "apiId") String apiId) {

        return apiDocumentInterface.getAllDocumentsofAPI(apiId);
    }

    @GetMapping("/{apiId}/{documentId}")
    public APIDocument getAPIDocument(@PathVariable(value = "apiId") String apiId, @PathVariable(value = "documentId") String documentId) {

        return apiDocumentInterface.getAPIDocument(apiId, documentId);
    }

    @GetMapping("/{apiId}/{documentId}/content")
    public String getContentAPIDocument(@PathVariable(value = "apiId") String apiId, @PathVariable(value = "documentId") String documentId) {

        return apiDocumentInterface.getContentAPIDocument(apiId, documentId);
    }

}
