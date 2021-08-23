package com.example.microservicedemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties("limits-service")
@Setter
@Getter
public class Configuration {

	private int maximum;
	private int minimum;
}
