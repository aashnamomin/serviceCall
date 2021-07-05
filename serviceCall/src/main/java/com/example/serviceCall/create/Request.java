package com.example.serviceCall.create;

public class Request
{
    private String processCode;

    private String channel;

    private String language;

    private String priority;

    private String userId;

    private String operation;

    private Party party;

    private RequestDocuments requestDocuments;

    public String getProcessCode ()
    {
        return processCode;
    }

    public void setProcessCode (String processCode)
    {
        this.processCode = processCode;
    }

    public String getChannel ()
    {
        return channel;
    }

    public void setChannel (String channel)
    {
        this.channel = channel;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    public String getPriority ()
    {
        return priority;
    }

    public void setPriority (String priority)
    {
        this.priority = priority;
    }

    public String getUserId ()
    {
        return userId;
    }

    public void setUserId (String userId)
    {
        this.userId = userId;
    }

    public String getOperation ()
    {
        return operation;
    }

    public void setOperation (String operation)
    {
        this.operation = operation;
    }

    public Party getParty ()
    {
        return party;
    }

    public void setParty (Party party)
    {
        this.party = party;
    }

    public RequestDocuments getRequestDocuments ()
    {
        return requestDocuments;
    }

    public void setRequestDocuments (RequestDocuments requestDocuments)
    {
        this.requestDocuments = requestDocuments;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [processCode = "+processCode+", channel = "+channel+", language = "+language+", priority = "+priority+", userId = "+userId+", operation = "+operation+", party = "+party+", requestDocuments = "+requestDocuments+"]";
    }
}
		
