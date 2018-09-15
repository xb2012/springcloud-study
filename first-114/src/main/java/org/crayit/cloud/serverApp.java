package org.crayit.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class serverApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(serverApp.class).web(true).run(args);

	}

}
