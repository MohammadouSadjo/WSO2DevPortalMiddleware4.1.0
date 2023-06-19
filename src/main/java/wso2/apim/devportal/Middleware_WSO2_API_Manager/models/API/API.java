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
public class API {

    private String id;

    private String name;

    private String description;

    private String context;

    private String version;

    private String type;

    private String createdTime;

    private String provider;

    private String lifeCycleStatus;

    private String thumbnailUri;

    private String avgRating;

    private List<String> throttlingPolicies;

    private AdvertiseInfo advertiseInfo;

    private BusinessInformation businessInformation;

    private Boolean isSubscriptionAvailable;

    private String monetizationLabel;

    private String gatewayVendor;
}
