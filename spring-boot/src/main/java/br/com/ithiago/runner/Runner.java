package br.com.ithiago.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@SpringBootApplication(scanBasePackages="br.com.ithiago")

@Configuration()
@EnableAutoConfiguration
@ComponentScan(basePackages="br.com.ithiago")
@EnableSwagger2
public class Runner {

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}
}

