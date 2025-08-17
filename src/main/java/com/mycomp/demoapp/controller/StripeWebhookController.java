package com.mycomp.demoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/stripe/webhook")
public class StripeWebhookController {
	
	//add slf4j logger object
	private static final Logger Logger = LoggerFactory.getLogger(StripeWebhookController.class);

	@PostMapping
	public String add(@RequestBody String request)
	{
		//System.out.println("*Received addition request : " + request);
		
		Logger.info("*Received Stripe Webhook  request: {}" + request);
		
		return "";
		
		
		
	}

  }

