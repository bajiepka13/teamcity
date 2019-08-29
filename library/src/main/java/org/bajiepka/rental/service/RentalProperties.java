package org.bajiepka.rental.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "srv")
public class RentalProperties {

    /**
     * Some message from some service
     */
    private String message;

    private String anotherProperty;

    public String getAnotherProperty() {
        return anotherProperty;
    }

    public void setAnotherProperty(String anotherProperty) {
        this.anotherProperty = anotherProperty;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
