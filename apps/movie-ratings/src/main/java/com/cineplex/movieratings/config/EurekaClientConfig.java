package com.cineplex.movieratings.config;


import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EurekaClientConfig {
	
	@Bean
	public EurekaClientConfigBean eurekaClientConfigBean() {
		EurekaClientConfigBean bean = new EurekaClientConfigBean();
		bean.setRegistryFetchIntervalSeconds(5);
		return bean;
	}
}
