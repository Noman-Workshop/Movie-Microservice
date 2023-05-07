package com.cineplex.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@EnableEurekaServer
@RestController
@Configuration
public class DiscoveryServerApplication {
	
	private final EurekaClientConfigBean eurekaClientConfigBean;
	
	public DiscoveryServerApplication(EurekaClientConfigBean eurekaClientConfigBean) {
		this.eurekaClientConfigBean = eurekaClientConfigBean;
	}
	
	// set service url for eureka client
	@PostMapping ("/setServiceUrl/{serviceUrl}")
	public void setServiceUrl(@PathVariable String serviceUrl) {
		Map<String, String> serviceUrls = eurekaClientConfigBean.getServiceUrl();
		String existingUrls = serviceUrls
				.get(EurekaClientConfigBean.DEFAULT_ZONE);
		String newUrls = existingUrls + "," + "http://" + serviceUrl + "/eureka";
		serviceUrls
				.put(EurekaClientConfigBean.DEFAULT_ZONE, newUrls);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}
	
}
