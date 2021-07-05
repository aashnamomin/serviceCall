package com.example.serviceCall.create;

public class Response {
	private String requestMessage;

	private String userMessage;

	private AdditionalParams additionalParams;

	private String requestId;

	private String requestCode;

	private String requestStatus;

	private Party party;

	public String getRequestMessage() {
		return requestMessage;
	}

	public void setRequestMessage(String requestMessage) {
		this.requestMessage = requestMessage;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

	public AdditionalParams getAdditionalParams() {
		return additionalParams;
	}

	public void setAdditionalParams(AdditionalParams additionalParams) {
		this.additionalParams = additionalParams;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestCode() {
		return requestCode;
	}

	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	@Override
	public String toString() {
		return "ClassPojo [requestMessage = " + requestMessage + ", userMessage = " + userMessage
				+ ", additionalParams = " + additionalParams + ", requestId = " + requestId + ", requestCode = "
				+ requestCode + ", requestStatus = " + requestStatus + ", party = " + party + "]";
	}
}
