package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Result;

@RequestMapping("/dept")
@RestController
public class DeptController {

	private Logger log = LoggerFactory.getLogger(DeptController.class);
	
	@PostMapping("/get/{id}")
	public Result get(@PathVariable("id") Integer id) {
		Result result = new Result();
		
		log.info("Provider DeptController get method...");
		result.setInfo("您传入的 DeptId 是:" + id);
		
		return result;
	}
}
