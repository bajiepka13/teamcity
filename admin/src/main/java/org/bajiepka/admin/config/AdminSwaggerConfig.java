package org.bajiepka.admin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class AdminSwaggerConfig implements SwaggerFields {

    @Value(value = "${swagger.version}")
    String version;

    @Bean
    Docket adminDocket() {

        return getDocket(
                "admin",
                "Административные функции",
                "-",
                version);
    }
}
