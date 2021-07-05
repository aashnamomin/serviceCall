package com.example.serviceCall.create;

public class Address {
	private String poBox;

	private String city;

	private String isNewLocation;

	private String isPrimaryAddress;

	private String addressLine1English;

	private String addressLine1Arabic;

	private String isNewAddress;

	private String type;

	private String emirates;

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getIsNewLocation() {
		return isNewLocation;
	}

	public void setIsNewLocation(String isNewLocation) {
		this.isNewLocation = isNewLocation;
	}

	public String getIsPrimaryAddress() {
		return isPrimaryAddress;
	}

	public void setIsPrimaryAddress(String isPrimaryAddress) {
		this.isPrimaryAddress = isPrimaryAddress;
	}

	public String getAddressLine1English() {
		return addressLine1English;
	}

	public void setAddressLine1English(String addressLine1English) {
		this.addressLine1English = addressLine1English;
	}

	public String getAddressLine1Arabic() {
		return addressLine1Arabic;
	}

	public void setAddressLine1Arabic(String addressLine1Arabic) {
		this.addressLine1Arabic = addressLine1Arabic;
	}

	public String getIsNewAddress() {
		return isNewAddress;
	}

	public void setIsNewAddress(String isNewAddress) {
		this.isNewAddress = isNewAddress;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmirates() {
		return emirates;
	}

	public void setEmirates(String emirates) {
		this.emirates = emirates;
	}

	@Override
	public String toString() {
		return "ClassPojo [poBox = " + poBox + ", city = " + city + ", isNewLocation = " + isNewLocation
				+ ", isPrimaryAddress = " + isPrimaryAddress + ", addressLine1English = " + addressLine1English
				+ ", addressLine1Arabic = " + addressLine1Arabic + ", isNewAddress = " + isNewAddress + ", type = "
				+ type + ", emirates = " + emirates + "]";
	}
}
