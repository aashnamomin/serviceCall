package com.example.serviceCall.create;

public class Request2
{
    private String processCode;

    private String channel;

    private String language;

    private RequestDocuments requestDocuments;

	public String getProcessCode() {
		return processCode;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public RequestDocuments getRequestDocuments() {
		return requestDocuments;
	}

	public void setRequestDocuments(RequestDocuments requestDocuments) {
		this.requestDocuments = requestDocuments;
	}

}
		
