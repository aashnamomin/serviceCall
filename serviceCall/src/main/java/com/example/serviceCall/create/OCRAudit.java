package com.example.serviceCall.create;

public class OCRAudit
{
    private String isVerified;

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
        return "ClassPojo [isVerified = "+isVerified+", bypassApprovedUserId = "+bypassApprovedUserId+", bypassReason = "+bypassReason+"]";
    }
}
			
	
