package com.omarezzat.config;

import com.omarezzat.dao.DatabaseOperations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.omarezzat")

public class Config {

    @Bean
    public DatabaseOperations databaseOperations(@Value("${database.url}") String url,
                                                @Value("${database.user}") String user ,
                                                @Value("${database.password}") String password) {
        return new DatabaseOperations(url, user, password);
    }
}
