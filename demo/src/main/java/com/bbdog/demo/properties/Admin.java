package com.bbdog.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
@PropertySource(value = {"classpath:config/admin.properties"})
@ConfigurationProperties(prefix = "admin")
public class Admin {
    private String username;
    private String password;

}
