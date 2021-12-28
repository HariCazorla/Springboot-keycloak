package com.shreeharibi.springkeycloak.config;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    KeycloakConfigResolver configResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
}
