package com.swag.saytime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 测试 --swagger示例
 * 用@Configuration注解该类，等价于XML中配置beans；
 * 用@Bean标注方法等价于XML中配置bean。
 */
@Configuration
public class Swagger2  {

    /**
     * 创建restful风格的接口
     * @return
     */
   @Bean
   public Docket createRestApi(){
       return new Docket(DocumentationType.SWAGGER_2)
               .apiInfo(apiInfo())
               .select()
               .apis(RequestHandlerSelectors.basePackage("com.swag.resource.web"))
               .paths(PathSelectors.any())
               .build();

   }

    /**
     * 接口描述信息及版本生成
     * @return
     */
    private ApiInfo apiInfo(){
       return new ApiInfoBuilder()
               .title("springboot利用swagger构建api文档")
               .description("简单优雅的restful风格,htttp://www.baidu")
               .termsOfServiceUrl("描述：http://www.baidu")
               .contact(new Contact("测试USER",null,null))
               .version("1.0")
               .build();
    }


}
