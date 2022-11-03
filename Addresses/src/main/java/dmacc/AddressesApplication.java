package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Addresses;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.AddressRepository;

@SpringBootApplication
public class AddressesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressesApplication.class, args);	
	}
}
