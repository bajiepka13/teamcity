package org.bajiepka.admin.config;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

public interface SwaggerFields {

    String LICENSE = "Используйте это приложение на свой страх и риск.";
    String LICENSE_URL = "nolicenseurl.com";
    Contact AUTHOR = new Contact("Валерий", "Чаленко", "valerii.chalenko@mail.ru");
    String TERMS_OF_USE = "notermsofusage.com";

    default Docket getDocket(String group, String name, String description, String version) {
        return new Docket(DocumentationType.SWAGGER_2).groupName(group)
                .apiInfo(
                        new ApiInfo(
                                name,
                                description,
                                version,
                                TERMS_OF_USE,
                                AUTHOR,
                                LICENSE,
                                LICENSE_URL,
                                Collections.emptyList()))
                .select()
                .paths(PathSelectors.ant(String.format("/%s/**", group)))
                .build();
    }

}
