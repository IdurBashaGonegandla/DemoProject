package com.mycomp.demoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.demoapp.pojo.AdditionalRequest;
import com.mycomp.demoapp.pojo.AdditionalResponse;
import com.mycomp.demoapp.pojo.MyService;
import com.mycomp.demoapp.service.AdditionalService;

@RestController
@RequestMapping("/api/add")
public class AdditionalController {
	
	//add slf4j logger object
	private static final Logger Logger = LoggerFactory.getLogger(AdditionalController.class);
	
	
	@Autowired
	private AdditionalService additionalService;
	
	private MyService myService;
	
	public AdditionalController(MyService myService) {
		Logger.info("**Additional Initialized");
		this.myService = myService;
	}



	@PostMapping
	public AdditionalResponse add(@RequestBody AdditionalRequest request)
	{
		//System.out.println("*Received addition request : " + request);
		
		Logger.info("*Received additional request: {}" + request);
		
        
		String message1 =myService.myMethod();
		
		Logger.info("Message from  :" , message1);
		
		return additionalService.addNumbers(request);
		
		
		
	}
	
	

}
