package ie.cct.firstprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ie.cct")
public class FirstProgramApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstProgramApplication.class, args);
	}
}
