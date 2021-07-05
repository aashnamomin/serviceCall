package com.example.serviceCall.create;

public class BioMetricAudit
{
    private String isVerified;

    private String verificationMode;

    private String bypassApprovedUserId;

    private String bypassReason;

    public String getIsVerified ()
    {
        return isVerified;
    }

    public void setIsVerified (String isVerified)
    {
        this.isVerified = isVerified;
    }

    public String getVerificationMode ()
    {
        return verificationMode;
    }

    public void setVerificationMode (String verificationMode)
    {
        this.verificationMode = verificationMode;
    }

    public String getBypassApprovedUserId ()
    {
        return bypassApprovedUserId;
    }

    public void setBypassApprovedUserId (String bypassApprovedUserId)
    {
        this.bypassApprovedUserId = bypassApprovedUserId;
    }

    public String getBypassReason ()
    {
        return bypassReason;
    }

    public void setBypassReason (String bypassReason)
    {
        this.bypassReason = bypassReason;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [isVerified = "+isVerified+", verificationMode = "+verificationMode+", bypassApprovedUserId = "+bypassApprovedUserId+", bypassReason = "+bypassReason+"]";
    }
}
			