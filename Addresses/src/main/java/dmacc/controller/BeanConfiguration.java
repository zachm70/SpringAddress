package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Addresses;

@Configuration
public class BeanConfiguration {

	@Bean
	public Addresses addresses() {
		Addresses bean = new Addresses();
		bean.setAddress("456 1st Street");
		bean.setCity("Indianola");
		bean.setName("Zach Meyer");
		bean.setZip(50125);
		return bean;
	}
}
