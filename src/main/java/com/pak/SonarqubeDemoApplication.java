package com.pak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarqubeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarqubeDemoApplication.class, args);
	}

}
/*   
Run:-#Maven clean

Run:-# jacoco cmd:
clean org.jacoco:jacoco-maven-plugin:prepare-agent install

# sonar cmd:
sonar:sonar 
*/