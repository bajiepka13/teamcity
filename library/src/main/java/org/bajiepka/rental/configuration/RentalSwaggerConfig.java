package org.bajiepka.rental.configuration;

import org.bajiepka.admin.config.SwaggerFields;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class RentalSwaggerConfig implements SwaggerFields {

    @Value(value = "${swagger.version}")
    String version;

    @Bean
    Docket rentalDocket() {

        return getDocket(
                "rental",
                "Аренда транспортных средств",
                "-",
                version);
    }

    private Contact getContacts() {
        return new Contact("Валерий", "Чаленко", "valerii.chalenko@mail.ru");
    }

    private String getLicense() {
        return "Используйте это приложение на свой страх и риск.";
    }

}
