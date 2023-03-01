package com.maveric.gatewayservice.properties;

//import com.maveric.gatewayservice.filter.AuthenticationPreFilter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("account-service")
public class AccountProperties {
    private String path;

    private String uri;


}
