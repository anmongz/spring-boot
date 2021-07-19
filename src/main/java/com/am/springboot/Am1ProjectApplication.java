package com.am.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Am1ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Am1ProjectApplication.class, args);
	}

}
