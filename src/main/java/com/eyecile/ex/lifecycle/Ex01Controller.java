package com.eyecile.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//주소가 중복될때
@RequestMapping("/lifecycle/ex01")
public class Ex01Controller {

	//spring에서는 메소드 하나당 페이지 하나라고 생각한다.
	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		return "예제 1번 문자열을 RESPONSE에 담는다"; 
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> printMap() {
		//과일 이름과 가격
		Map<String, Integer> map = new HashMap<>() ;
		map.put("apple", 1500);
		map.put("banana", 3000);
		map.put("orange", 1000);
		
		return map;
	}
	
}
