package org.crayit.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class policeServer {

	public static void main(String[] args) {
		new SpringApplicationBuilder(policeServer.class).web(true).run(args);

	}

}
