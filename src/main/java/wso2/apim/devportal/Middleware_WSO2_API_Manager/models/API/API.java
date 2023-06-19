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

    private String apiDefinition;

    private String wsdlUri;

    private Boolean isDefaultVersion;

    private List<String> transport;

    private String authorizationHeader;

    private List<String> securityScheme;

    private List<String> tags;

    private List<Tier> tiers;

    private Boolean hasThumbnail;

    private Monetization monetization;

    private List<EndpointURL> endpointURLs;

    private List<String> environmentList;

    private List<Scope> scopes;

    private List<String> categories;

    private List<String> keyManagers;

    private String lastUpdatedTime;

    private List<String> asyncTransportProtocols;

}
