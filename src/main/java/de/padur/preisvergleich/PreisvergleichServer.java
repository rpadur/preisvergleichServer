/**
 * 
 */
package de.padur.preisvergleich;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * @author ronald.padur
 *
 */
@SpringBootApplication
public class PreisvergleichServer extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PreisvergleichServer.class, args);

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PreisvergleichServer.class);
	}
}
