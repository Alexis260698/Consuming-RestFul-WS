package com.example.consumingRestFulWS;

import com.example.consumingRestFulWS.dto.ComentarioDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestFulWsApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConsumingRestFulWsApplication.class, args);


	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args->{
			ComentarioDTO comentario=restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", ComentarioDTO.class);
			System.out.println(comentario.toString());
		};
	}

}
