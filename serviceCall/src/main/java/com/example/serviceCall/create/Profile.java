package com.example.serviceCall.create;

public class Profile {
	private String partyProfileType;

	private String partyProfileSubType;

	private String status;

	public String getPartyProfileType() {
		return partyProfileType;
	}

	public void setPartyProfileType(String partyProfileType) {
		this.partyProfileType = partyProfileType;
	}

	public String getPartyProfileSubType() {
		return partyProfileSubType;
	}

	public void setPartyProfileSubType(String partyProfileSubType) {
		this.partyProfileSubType = partyProfileSubType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ClassPojo [partyProfileType = " + partyProfileType + ", partyProfileSubType = " + partyProfileSubType
				+ ", status = " + status + "]";
	}
}
