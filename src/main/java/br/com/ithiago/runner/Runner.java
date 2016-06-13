package br.com.ithiago.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication(scanBasePackages="br.com.ithiago")

@Configuration("application-context.xml")
@EnableAutoConfiguration
@ComponentScan(basePackages="br.com.ithiago")
public class Runner {

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}
	
}
