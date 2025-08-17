package com.mycomp.demoapp.pojo;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MyService {
	
	//public static final Logger Logger = LoggerFactory.getLogger(MyService.class);
	
	public String myMethod()
	{
		
		log.info("Mymethod called in MyService");
		
		String Message = "Calling my method from MyService";
		
		log.info("Message: {}" );
		return Message;
		
		
	}

}
