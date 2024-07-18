package dio.digitalinnovation.labPadroesProjetoSpringDesafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring para Desafio do Bootcamp DIO + Santander 2024
 * Os seguintes módulos foram usados
 * - Spring Data JPA
 * - Spring Web
 * - H2 DataBase
 * - OpenFeign
 */
@EnableFeignClients
@SpringBootApplication
public class ProjetoSpringDesafioApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjetoSpringDesafioApplication.class, args);
	}

}
