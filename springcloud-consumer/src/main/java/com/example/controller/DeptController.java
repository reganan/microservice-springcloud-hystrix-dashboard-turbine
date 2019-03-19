package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Result;
import com.example.service.DeptService;

@RequestMapping("/dept")
@RestController
public class DeptController {
	
	private Logger log = LoggerFactory.getLogger(DeptController.class);
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/get/{id}")
	public Result get(@PathVariable("id") Integer id) {
		log.info("DeptController get method...");
		//String version = request.getParameter("version");
		/**
		 * 灰度发布
		 * 实现方式：根据 参数中的 version 在自定义负载均衡中匹配对应的 Server 返回
		 */
//		if (!HystrixRequestContext.isCurrentThreadInitialized()) {
//			HystrixRequestContext.initializeContext();
//		}
//		if (!StringUtils.isEmpty(ver)) {
//			RequestVariableHolder.echo.set(ver);
//		}

		return deptService.get(id);
	}
}
