package org.crayit.cloud;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class serverApp {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		String port=scan.nextLine();
		new SpringApplicationBuilder(serverApp.class).properties("server.port="+port).run(args);

	}

}
