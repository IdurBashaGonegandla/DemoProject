package com.mycomp.demoapp.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyService {
	
	public static final Logger Logger = LoggerFactory.getLogger(MyService.class);
	
	public String myMethod()
	{
		
		Logger.info("Mymethod called in MyService");
		
		String Message = "Calling my method from MyService";
		
		Logger.info("Message: {}" );
		return Message;
		
		
	}

}
