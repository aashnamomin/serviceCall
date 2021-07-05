package com.example.serviceCall.sampleRequest;

public abstract class BaseRequest {
	
	private String channel;
	private String transactionId;
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
}
