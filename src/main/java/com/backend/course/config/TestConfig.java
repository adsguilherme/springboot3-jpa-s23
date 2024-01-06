package com.backend.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.backend.course.entities.User;
import com.backend.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	// Injeção de depêndencia implícito, que ocorre de forma automática.
	// A annotation @Autowired vai resolver a dependência e associar uma instância de UserRepository dentro da classe TestConfig.
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		// Salvando lista de objetos no banco de dados
		// Ao executar o projeto os dados serão inseridos no banco de dados
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
