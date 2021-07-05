package com.example.serviceCall;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableAutoConfiguration

@ComponentScan
public class ServiceCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCallApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	/*
	 * @Bean public RestTemplate restTemplate() { return new RestTemplate(); }
	 */

	@Bean 
	public RestTemplate restTemplate(RestTemplateBuilder builder) { 
		
		//return builder.setConnectTimeout(Duration.ofMillis(3000)).setReadTimeout(Duration.ofMillis(3000)).build(); 
	  SimpleClientHttpRequestFactory requestFactory = new
	  SimpleClientHttpRequestFactory(); 
	  requestFactory.setConnectTimeout(3000); //Set the timeout 
	  requestFactory.setReadTimeout(3000); 
	  RestTemplate restTemplate = new RestTemplate();
	  restTemplate.setRequestFactory(requestFactory); return restTemplate;
		
	
	  
	}

	

}
