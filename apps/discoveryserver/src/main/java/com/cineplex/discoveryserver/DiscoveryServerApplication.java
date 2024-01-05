package com.cineplex.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
<<<<<<< Updated upstream:apps/discoveryserver/src/main/java/com/cineplex/discoveryserver/DiscoveryServerApplication.java
<<<<<<< Updated upstream:apps/discoveryserver/src/main/java/com/cineplex/discoveryserver/DiscoveryServerApplication.java

@SpringBootApplication
@EnableEurekaServer
=======
=======
>>>>>>> Stashed changes:apps/discovery-server/src/main/java/com/cineplex/discoveryserver/DiscoveryServerApplication.java
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
<<<<<<< Updated upstream:apps/discoveryserver/src/main/java/com/cineplex/discoveryserver/DiscoveryServerApplication.java
>>>>>>> Stashed changes:apps/discovery-server/src/main/java/com/cineplex/discoveryserver/DiscoveryServerApplication.java
=======
>>>>>>> Stashed changes:apps/discovery-server/src/main/java/com/cineplex/discoveryserver/DiscoveryServerApplication.java
public class DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}

}
