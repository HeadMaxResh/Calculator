package calculator.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class Config {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any()).build();
    }

    private ApiInfo getInfo(){
        return new  ApiInfoBuilder().title("Calculator").description("REST - app, calculator").
                    contact(new Contact("Maxim Reshetnikov","","Max.R3shetnikov@yandex.ru")).build();
    }
}
