package com.eyecile.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eyecile.ex.lifecycle.model.Person;

//@Controller
@RestController // -> @Controller + @ResponseBody
@RequestMapping("/lifecycle/ex01")
public class Ex01RestController {

	@RequestMapping("/3")
	public String printString() {
		return "RestController 테스트";
	}
	
	@RequestMapping("/4")
	public Person printObject() {
		Person person = new Person();
		
		person.setName("최현명");
		person.setAge(27);
		
		return person;
	}
	
	@RequestMapping("/5")
	public ResponseEntity<Person> entity() {
Person person = new Person();
		
		person.setName("최현명");
		person.setAge(27);
		
		//데이터를 전달할때 response 의  status 코드를 추가로 전달
		// = response에서 지금 내가 요청한것에 대해 어떻게 처리 되었는지 코드를 통해 알려주는것
		//정상적인 상황에서도 코드가 전달 됨 status 200
		// Internal_Server_Error 500 - 코드에 문제가 생겼을때 발생
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
		
		
	}
	
}
