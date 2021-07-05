package com.example.serviceCall.sampleRequest;

public class Request<T, A, P> extends BaseRequest {
	
	private T party;
	private A addresses;
	private P profiles;
	
	protected T getParty() {
		return party;
	}
	protected void setParty(T party) {
		this.party = party;
	}
	protected A getAddresses() {
		return addresses;
	}
	protected void setAddresses(A addresses) {
		this.addresses = addresses;
	}
	protected P getProfiles() {
		return profiles;
	}
	protected void setProfiles(P profiles) {
		this.profiles = profiles;
	}
	
	

}
