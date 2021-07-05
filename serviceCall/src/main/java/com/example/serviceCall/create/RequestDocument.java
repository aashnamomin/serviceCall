package com.example.serviceCall.create;

public class RequestDocument
{
    private DocumentDetails documentDetails;

    private String documentType;

    private String documentStream;

    private String documentOwner;

    private String documentValue;

    public DocumentDetails getDocumentDetails ()
    {
        return documentDetails;
    }

    public void setDocumentDetails (DocumentDetails documentDetails)
    {
        this.documentDetails = documentDetails;
    }

    public String getDocumentType ()
    {
        return documentType;
    }

    public void setDocumentType (String documentType)
    {
        this.documentType = documentType;
    }

    public String getDocumentStream ()
    {
        return documentStream;
    }

    public void setDocumentStream (String documentStream)
    {
        this.documentStream = documentStream;
    }

    public String getDocumentOwner ()
    {
        return documentOwner;
    }

    public void setDocumentOwner (String documentOwner)
    {
        this.documentOwner = documentOwner;
    }

    public String getDocumentValue ()
    {
        return documentValue;
    }

    public void setDocumentValue (String documentValue)
    {
        this.documentValue = documentValue;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [documentDetails = "+documentDetails+", documentType = "+documentType+", documentStream = "+documentStream+", documentOwner = "+documentOwner+", documentValue = "+documentValue+"]";
    }
}
			
			