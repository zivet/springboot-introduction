package com.ioverlap.dojo.consumingsoapwebservice;

import com.dataaccess.webservicesserver.NumberToWordsResponse;
import com.ioverlap.dojo.consumingsoapwebservice.consuming.NumberClient;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@SpringBootApplication
public class ConsumingSoapWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingSoapWebserviceApplication.class, args);
	}

	@Bean
	public CommandLineRunner consumingService() {
		return args -> {
			NumberClient numberClient = new NumberClient();

			Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
			marshaller.setContextPath("com.dataaccess.webservicesserver");
			numberClient.setMarshaller(marshaller);
			numberClient.setUnmarshaller(marshaller);

			NumberToWordsResponse response = numberClient.getWords("1987");
			LoggerFactory.getLogger(this.getClass()).info("Response is: " + response.getNumberToWordsResult());
		};
	}
}
