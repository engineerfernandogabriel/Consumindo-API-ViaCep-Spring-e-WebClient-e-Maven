package br.com.octopus.viaCep;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "ViaCep API with WebClient-Maven", version = "1.0", description = "API para consulta de CEP"))
public class ViaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaCepApplication.class, args);
	}
}
