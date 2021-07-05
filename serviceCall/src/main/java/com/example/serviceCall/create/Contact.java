package com.example.serviceCall.create;

public class Contact
{
    private String personName;

    private String contactValue;

    private String isPrimary;

    private String teleMarketing;

    private String preferredLang;

    private String type;

    private String priority;

    public String getPersonName ()
    {
        return personName;
    }

    public void setPersonName (String personName)
    {
        this.personName = personName;
    }

    public String getContactValue ()
    {
        return contactValue;
    }

    public void setContactValue (String contactValue)
    {
        this.contactValue = contactValue;
    }

    public String getIsPrimary ()
    {
        return isPrimary;
    }

    public void setIsPrimary (String isPrimary)
    {
        this.isPrimary = isPrimary;
    }

    public String getTeleMarketing ()
    {
        return teleMarketing;
    }

    public void setTeleMarketing (String teleMarketing)
    {
        this.teleMarketing = teleMarketing;
    }

    public String getPreferredLang ()
    {
        return preferredLang;
    }

    public void setPreferredLang (String preferredLang)
    {
        this.preferredLang = preferredLang;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getPriority ()
    {
        return priority;
    }

    public void setPriority (String priority)
    {
        this.priority = priority;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [personName = "+personName+", contactValue = "+contactValue+", isPrimary = "+isPrimary+", teleMarketing = "+teleMarketing+", preferredLang = "+preferredLang+", type = "+type+", priority = "+priority+"]";
    }
}
			
		