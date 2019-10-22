package com.bbdog.demo.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Data
@PropertySource(value = {"classpath:/admin.properties"})
@ConfigurationProperties(prefix = "admin")
public class Admin {
    @Value(value = "${admin.username}")
    private String username;
    @Value(value = "${admin.password}")
    private String password;

}
