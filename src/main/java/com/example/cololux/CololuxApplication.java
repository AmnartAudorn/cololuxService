package com.example.cololux;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CololuxApplication {

	public static void main(String[] args) {
		SpringApplication.run(CololuxApplication.class, args);
		System.out.println("");
	}

}
