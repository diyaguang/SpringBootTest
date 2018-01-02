package com.dygstudio.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/*
如果必须使用xml配置，可以通过 Spring 提供的@ImportResource类加载xml配置。
 */
//@ImportResource({"classpath:some-context.xml","classpath:another-context.xml"})
@SpringBootApplication
public class SpringboottestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottestApplication.class, args);
	}
}
