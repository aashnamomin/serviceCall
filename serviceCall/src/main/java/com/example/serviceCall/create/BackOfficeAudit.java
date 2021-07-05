package com.example.serviceCall.create;

public class BackOfficeAudit
{
    private String verificationResult;

    private String verifyerUserId;

    private String notes;

    private String isVerified;

    public String getVerificationResult ()
    {
        return verificationResult;
    }

    public void setVerificationResult (String verificationResult)
    {
        this.verificationResult = verificationResult;
    }

    public String getVerifyerUserId ()
    {
        return verifyerUserId;
    }

    public void setVerifyerUserId (String verifyerUserId)
    {
        this.verifyerUserId = verifyerUserId;
    }

    public String getNotes ()
    {
        return notes;
    }

    public void setNotes (String notes)
    {
        this.notes = notes;
    }

    public String getIsVerified ()
    {
        return isVerified;
    }

    public void setIsVerified (String isVerified)
    {
        this.isVerified = isVerified;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [verificationResult = "+verificationResult+", verifyerUserId = "+verifyerUserId+", notes = "+notes+", isVerified = "+isVerified+"]";
    }
}
			
		
