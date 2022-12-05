package com.eyecile.ex;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringExampleApplication {			// xml과 dao&bo는 파일 형태가 달라 컴파일이 안되서 어딨는지 알려주는것 / 아래 xml도 그런방식

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}
	
	

}
