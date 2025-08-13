package com.mycomp.demoapp.service;

import org.springframework.stereotype.Service;

import com.mycomp.demoapp.pojo.AdditionalRequest;
import com.mycomp.demoapp.pojo.AdditionalResponse;

@Service
public class AdditionalServiceImpl implements AdditionalService {

	@Override
	public AdditionalResponse addNumbers(AdditionalRequest request) {
		
		int sum = request.getNum1() + request.getNum2();
		return new AdditionalResponse(sum);
	}

	
}
