package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdvertiseInfo {

    private Boolean advertised;

    private String apiExternalProductionEndpoint;

    private String apiExternalSandboxEndpoint;

    private String originalDevPortalUrl;

    private String apiOwner;

    private String vendor;


}
