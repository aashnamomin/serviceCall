package com.example.serviceCall.create;

public class Addresses {
	private Address address;

    public Address getAddress ()
    {
        return address;
    }

    public void setAddress (Address address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [address = "+address+"]";
    }
}
