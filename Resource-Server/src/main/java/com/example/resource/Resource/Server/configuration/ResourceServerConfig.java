package com.example.resource.Resource.Server.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class ResourceServerConfig {

    @Value("${jwk.set.uri}")
    private String jwkSetUri;

    @Bean
    public JwtDecoder jwtDecoder(){
        return NimbusJwtDecoder.withJwkSetUri(jwkSetUri).build();
    }

//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.securityMatcher("/articles/**")
//                .authorizeHttpRequests()
//                .requestMatchers("/articles/**")
//                .access()
//                .and()
//                .oauth2ResourceServer()
//                .jwt();
//
//        return http.build();
//
//
//    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.securityMatcher("/articles/**")
                .authorizeHttpRequests()
                .and()
                .oauth2ResourceServer()
                .jwt();

        return http.build();


    }

}