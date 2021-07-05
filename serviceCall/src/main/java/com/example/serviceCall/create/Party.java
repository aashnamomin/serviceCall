package com.example.serviceCall.create;

public class Party
{
    private String prospect;

    private String preferredLanguage;

    private Addresses addresses;

    private String emirate;

    private Individual individual;

    private String segment;

    private Profiles profiles;

    private Contacts contacts;

    public String getProspect ()
    {
        return prospect;
    }

    public void setProspect (String prospect)
    {
        this.prospect = prospect;
    }

    public String getPreferredLanguage ()
    {
        return preferredLanguage;
    }

    public void setPreferredLanguage (String preferredLanguage)
    {
        this.preferredLanguage = preferredLanguage;
    }

    public Addresses getAddresses ()
    {
        return addresses;
    }

    public void setAddresses (Addresses addresses)
    {
        this.addresses = addresses;
    }

    public String getEmirate ()
    {
        return emirate;
    }

    public void setEmirate (String emirate)
    {
        this.emirate = emirate;
    }

    public Individual getIndividual ()
    {
        return individual;
    }

    public void setIndividual (Individual individual)
    {
        this.individual = individual;
    }

    public String getSegment ()
    {
        return segment;
    }

    public void setSegment (String segment)
    {
        this.segment = segment;
    }

    public Profiles getProfiles ()
    {
        return profiles;
    }

    public void setProfiles (Profiles profiles)
    {
        this.profiles = profiles;
    }

    public Contacts getContacts ()
    {
        return contacts;
    }

    public void setContacts (Contacts contacts)
    {
        this.contacts = contacts;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [prospect = "+prospect+", preferredLanguage = "+preferredLanguage+", addresses = "+addresses+", emirate = "+emirate+", individual = "+individual+", segment = "+segment+", profiles = "+profiles+", contacts = "+contacts+"]";
    }
}