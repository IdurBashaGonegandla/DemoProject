package com.mycomp.demoapp.pojo;

public class AdditionalResponse {
	
	private int result;

	

	public AdditionalResponse(int result) {
		super();
		this.result = result;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "AdditionalResponse [result=" + result + "]";
	}
	
	

}
