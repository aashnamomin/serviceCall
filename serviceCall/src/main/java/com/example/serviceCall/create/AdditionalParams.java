package com.example.serviceCall.create;

public class AdditionalParams {
	private Entry[] entry;

	public Entry[] getEntry() {
		return entry;
	}

	public void setEntry(Entry[] entry) {
		this.entry = entry;
	}

	@Override
	public String toString() {
		return "ClassPojo [entry = " + entry + "]";
	}
}
