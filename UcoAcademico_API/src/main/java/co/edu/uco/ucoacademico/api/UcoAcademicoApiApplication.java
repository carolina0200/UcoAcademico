package co.edu.uco.ucoacademico.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"co.edu.uco.ucoacademico"})
@SpringBootApplication
public class UcoAcademicoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcoAcademicoApiApplication.class, args);
	}

}
