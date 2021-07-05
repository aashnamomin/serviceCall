package com.example.serviceCall.Dto;

public class ErrorDto implements BaseDto {
	private Integer errorCode;
	private String errorMsg;
	
	
	public ErrorDto() {
		super();
	}
	public ErrorDto(Integer errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
