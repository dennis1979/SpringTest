package com.example.dbDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}

//	dependencies {
//		compile('org.springframework.boot:spring-boot-starter-data-jpa')
//		compile('org.springframework.boot:spring-boot-starter-data-rest')
//		compile('org.springframework.boot:spring-boot-starter-web')
//		runtime('com.h2database:h2')
//		compileOnly('org.projectlombok:lombok')
//		testCompile('org.springframework.boot:spring-boot-starter-test')
//	}
}
