package com.example.serviceCall.create;

public class RequestDocuments
{
    private RequestDocument requestDocument;

    public RequestDocument getRequestDocument ()
    {
        return requestDocument;
    }

    public void setRequestDocument (RequestDocument requestDocument)
    {
        this.requestDocument = requestDocument;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [requestDocument = "+requestDocument+"]";
    }
}
	