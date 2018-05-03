package net.aikaka.javaboilerplates.microadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MicroAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroAdminApplication.class, args);
	}
}
