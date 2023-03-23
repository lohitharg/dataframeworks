package com.example.hibernatesample.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class Dbconfiguration {
    @Bean
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .username("postgres")
                .password("lohitha")
                .url("jdbc:postgresql://localhost:5432/hdb")
                .driverClassName("org.postgresql.Driver")
                .build();
    }
}
