package com.example.serviceCall.create;


public class OtpEmailAudit
{
    private String isVerified;

    private String verificationValue;

    public String getIsVerified ()
    {
        return isVerified;
    }

    public void setIsVerified (String isVerified)
    {
        this.isVerified = isVerified;
    }

    public String getVerificationValue ()
    {
        return verificationValue;
    }

    public void setVerificationValue (String verificationValue)
    {
        this.verificationValue = verificationValue;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [isVerified = "+isVerified+", verificationValue = "+verificationValue+"]";
    }
}
			
	