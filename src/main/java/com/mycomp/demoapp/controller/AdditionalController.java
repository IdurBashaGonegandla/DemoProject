package com.mycomp.demoapp.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.demoapp.pojo.AdditionalRequest;
import com.mycomp.demoapp.pojo.AdditionalResponse;
import com.mycomp.demoapp.pojo.MyService;
import com.mycomp.demoapp.service.AdditionalService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/add")
@Slf4j
@RequiredArgsConstructor
public class AdditionalController {
	
	/*add slf4j logger object
	private static final Logger Logger = LoggerFactory.getLogger(AdditionalController.class);
	*/
	
	private final  AdditionalService additionalService;
	private final MyService myService;
	private final ApplicationContext applicationContext;
	
	/*public AdditionalController(MyService myService , ApplicationContext applicationContext ,AdditionalService additionalService) {
		log.info("mService from : {}", myService);
		log.info("applicationContext: {}" , applicationContext);
		log.info("additionalService: {}", additionalService);
		this.myService = myService;
		this.applicationContext = applicationContext;
		this.additionalService = additionalService;
	}*/



	@PostMapping
	public AdditionalResponse add(@RequestBody AdditionalRequest request)
	{
		//System.out.println("*Received addition request : " + request);
		
		log.info("*Received additional request: {}" + request);
		
        /*dependency lookup
		myService = applicationContext.getBean(MyService.class);*/
		
		log.info("Using Dependency Lookup value MyService: {}", myService);
		
		String message =myService.myMethod();
		
		log.info("Message from MyService:{} " , message);
		
		return additionalService.addNumbers(request);
		
		
		
	}
	
	

}
