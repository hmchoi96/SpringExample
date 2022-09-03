package com.eyecile.ex.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {

	@RequestMapping("/lifecycle/ex02/1")
	//경로를 리턴하기때문에 무조건 스트링
	public String view() {
		return "lifecycle/ex02";
		 
	}
	
	
}
