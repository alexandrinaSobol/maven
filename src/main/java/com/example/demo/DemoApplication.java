package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//TODO printezi message din properties
		try (InputStream input = new FileInputStream("config/application.properties")) {
			var prop = new Properties();
			prop.load(input);

			System.out.println(prop.getProperty("message"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("eeeeeeeeee");

	}

}
