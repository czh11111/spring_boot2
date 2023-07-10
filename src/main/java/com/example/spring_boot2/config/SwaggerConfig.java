package com.example.spring_boot2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration //加载到配置里面
//开启Swagger
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)//配置了Swaggerbean实例
                .apiInfo(apiInfo())//重新配置了默认的文档信息
                .select()
                //RequestHandlerSelectors 要扫描接口的方式
                //指定要扫描的包 basePackage()
                //any() 扫描全部
                //withClassAnnotation() 扫描类上的注解，需要注解的反射对象
                //withMethodAnnotation() 扫描方法上注解
                //只会扫描有ResrController注解的类.生成一个接口
                .apis(RequestHandlerSelectors.basePackage("com.example.spring_boot2.controller"))
                .paths(PathSelectors.ant("/level1/**"))//过滤路径
                .build();//工厂模式
    }

    //配置Swagger信息=apiInfo
    public ApiInfo apiInfo(){

        Contact contact = new Contact("小七","xiaoqistudy.blog.csdn.net","123");//作者信息
        return new ApiInfo("Api Documentation",
                "Api Documentation", "1.0",
                "xiaoqistudy.blog.csdn.nets", contact,
                "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());

    }
}


