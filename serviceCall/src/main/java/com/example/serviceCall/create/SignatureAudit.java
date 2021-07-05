package com.example.serviceCall.create;

public class SignatureAudit
{
    private String verificationSignature;

    private String isVerified;

    public String getVerificationSignature ()
    {
        return verificationSignature;
    }

    public void setVerificationSignature (String verificationSignature)
    {
        this.verificationSignature = verificationSignature;
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
        return "ClassPojo [verificationSignature = "+verificationSignature+", isVerified = "+isVerified+"]";
    }
}
			
			
