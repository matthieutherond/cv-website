package com.matthieutherond.cvwebsite;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CvWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvWebsiteApplication.class, args);
	}

	@Bean
	ApplicationRunner init(CvRepository repository) {
		return args -> {
			Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
					"AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
				CuriculumVitae cv = new CuriculumVitae();

			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
