package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.API;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ThrottlingPolicy {

    private String name;

    private String displayName;

    private String description;

    private String policyContent;

    private String tierAttributes;

    private long requestsPerMin;

    private long requestCount;

    private long unitTime;

    private String timeUnit;

    private String tierPlan;

    private Boolean stopOnQuotaReached;

    private String tierPermission;

    private MonetizationAttributes monetizationAttributes;

    private String quotaPolicyType;

    private long rateLimitCount;

    private String rateLimitTimeUnit;

    private String bandwidthDataUnit;
}
