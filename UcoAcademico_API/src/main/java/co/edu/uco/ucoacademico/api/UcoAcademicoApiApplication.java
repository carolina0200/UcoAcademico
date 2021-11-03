package co.edu.uco.ucoacademico.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;


@SpringBootApplication
@EnableJpaRepositories(basePackages = {"co.edu.uco.ucoacademico.datos.dao"})
@EntityScan(basePackages = {"co.edu.uco.ucoacademico.entidad"})
@ComponentScan(basePackages = {"co.edu.uco.ucoacademico"})
public class UcoAcademicoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcoAcademicoApiApplication.class, args);
	}

	@Bean
	public ErrorViewResolver customErrorViewResolver() {
		final ModelAndView redirectToIndexHtml = new ModelAndView("forward:/index.html", Collections.emptyMap(), HttpStatus.OK);
		return (request, status, model) -> status == HttpStatus.NOT_FOUND ? redirectToIndexHtml : null;
	}

}
