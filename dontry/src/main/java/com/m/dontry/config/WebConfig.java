package com.m.dontry.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/users/**")
                .allowedOrigins("http://localhost:3000") // Postman'ı çalıştırdığınız domain ve port
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // İzin vermek istediğiniz kaynakları buraya ekleyin (örneğin, Postman'ın çalıştığı domain ve port)
        config.addAllowedOrigin("http://localhost:3000");

        // İzin vermek istediğiniz HTTP metotlarını buraya ekleyin (GET, POST, vb.)
        config.addAllowedMethod("*");

        // İzin vermek istediğiniz HTTP başlıklarını buraya ekleyin
        config.addAllowedHeader("*");

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
