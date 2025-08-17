package com.mycomp.demoapp.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycomp.demoapp.pojo.AdditionalRequest;
import com.mycomp.demoapp.pojo.AdditionalResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class AdditionalServiceImpl implements AdditionalService {
    
	private final Random random ;
	
	@Override
	public AdditionalResponse addNumbers(AdditionalRequest request) {

		
		int randomNum = random.nextInt(100);
		log.info("Generate RandomNumber: {}", randomNum);

		int sum = request.getNum1() + request.getNum2();
		return new AdditionalResponse(sum);
	}

}
