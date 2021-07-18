package com.sam.ms.userinfo;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    
    private final String appName = "UserInfo Application";

    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)
          .groupName("User_Info_API")
          .apiInfo(this.userApiInfo())
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.sam.ms.userinfo.controllers"))              
          .build();                                           
    }
    
    
    private ApiInfo userApiInfo() {
        return new ApiInfo(appName, appName +" Create/Read/Update/Delete", "1.0.0", null, null, null, null, Collections.emptyList());
    }

    /*
    private ApiInfo userApiInfo() {
        return new ApiInfoBuilder().title("JavaInUse API")
        .description("JavaInUse API reference for developers")
        .termsOfServiceUrl("http://javainuse.com")
        .contact("javainuse@gmail.com").license("JavaInUse License")
        .licenseUrl("javainuse@gmail.com").version("1.0").build();    } */

}
