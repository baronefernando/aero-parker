package com.aeroparker.AeroParker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.aeroparker.AeroParker")
@EnableJpaRepositories(basePackages = "com.aeroparker.AeroParker.repository")
@EntityScan(basePackages = "com.aeroparker.AeroParker.model")
public class AeroParkerApplication 
{

    public static void main(String[] args) 
	{
        SpringApplication.run(AeroParkerApplication.class, args);
    }
}
