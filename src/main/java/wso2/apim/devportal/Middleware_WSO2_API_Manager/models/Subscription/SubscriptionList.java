package wso2.apim.devportal.Middleware_WSO2_API_Manager.models.Subscription;

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
public class SubscriptionList {

    private int count;

    private List<Subscription> list;

    private Pagination pagination;
}
