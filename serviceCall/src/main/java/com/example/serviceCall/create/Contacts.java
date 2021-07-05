package com.example.serviceCall.create;

import java.util.List;

public class Contacts
{
    private List<Contact> contact;

    public List<Contact> getContact ()
    {
        return contact;
    }

    public void setContact (List<Contact> contact)
    {
        this.contact = contact;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [contact = "+contact+"]";
    }
}
