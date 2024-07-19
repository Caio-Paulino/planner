package com.rocketseat.planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlannerApplication.class, args);
	}

}


// Features: adicionar validação nos campos de data
// - data de começo da viagem é inferior a data de término da viagem
// - data de uma atividade está entre as datas de viagem
// Extração do core das trips para dentro da classe service
// Mapeamento das exceções da aplicação com tratativas de erro personalizadas
