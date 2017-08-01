package de.codeboje.springboot.tutorials.datarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@SpringBootApplication
public class SpringDataRestTutorialApplication {

	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {

		return new RepositoryRestConfigurerAdapter() {

			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				config.setRepositoryDetectionStrategy(
						RepositoryDetectionStrategy.RepositoryDetectionStrategies.ANNOTATED);
			}
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestTutorialApplication.class, args);
	}
}
