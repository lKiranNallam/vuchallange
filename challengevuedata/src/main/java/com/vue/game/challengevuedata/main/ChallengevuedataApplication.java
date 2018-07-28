package com.vue.game.challengevuedata.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.vue.game.challengevuedata.controller","com.vue.game.filter"} )
public class ChallengevuedataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengevuedataApplication.class, args);
	}
}
