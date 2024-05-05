package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.demo.dataBaseEngine.config.DataBaseConfiguration;

@SpringBootApplication(scanBasePackages = {"com.example.demo","com.demo.dataBaseEngine"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource.setUrl("jdbc:sqlserver://VG-KEERTHI\\\\SQLEXPRESS:1433;databaseName=SPRING_DB;encrypt=true;trustServerCertificate=true");
		dataSource.setUsername("SPRING_DB");
		dataSource.setPassword("SPRING_DB");
		return dataSource;
	}
	
	@Bean
	public DataBaseConfiguration dataBaseConfiguration(DataSource dataSource) {
		return new DataBaseConfiguration(dataSource);
	}
}
