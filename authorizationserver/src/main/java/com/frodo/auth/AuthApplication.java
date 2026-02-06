package com.frodo.auth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Random;

@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

	@Bean
	@Order(1)
	CommandLineRunner pingSelf() {
		return args -> {
			// small delay to ensure the web server is ready
			Thread.sleep(1000);

			RestTemplate rest = new RestTemplate();
			String url = "http://localhost:8080/ping";

			try {
				String response = rest.getForObject(url, String.class);
				System.out.println("Self-check OK -> " + response);
			} catch (Exception e) {
				System.err.println("Self-check FAILED: " + e.getMessage());
			}
		};
	}

	@Bean
	@Order(2)
	CommandLineRunner printRandomUser(JdbcTemplate jdbcTemplate) {
		return args -> {
			var users = jdbcTemplate.queryForList("SELECT username, password, role FROM users");
			Map<String, Object> randomUser = users.get(new Random().nextInt(users.size()));
			System.out.println("Random User from DB:");
			System.out.println("Username: " + randomUser.get("username"));
			System.out.println("Password: " + randomUser.get("password"));
			System.out.println("Role: " + randomUser.get("role"));
		};
	}

	@RestController
	static class HelloController {
		@GetMapping("/ping")
		public String hello() {
			return "***** rest controller ready";
		}
	}

}
