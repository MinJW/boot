package com.mjw;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BootApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(BootApplication.class);
		//修改Banner的模式为OFF
		builder.bannerMode(Banner.Mode.OFF).run(args);
	}

}
