package com.xiaot.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author xiaoT
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(
            new ApiInfo("博客文档接口"
                    , "Api 文档"
                    , "1.0"
                    , ""
                    , new Contact("", "", "")
                    , ""
                    , ""
                    , new ArrayList<>()
            )
        );
    }

}
