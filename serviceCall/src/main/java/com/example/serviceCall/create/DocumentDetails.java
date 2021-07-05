package com.example.serviceCall.create;

public class DocumentDetails
{
    private SignatureAudit signatureAudit;

    private ReaderAudit readerAudit;

    private String documentExtension;

    private OtpEmailAudit otpEmailAudit;

    private String documentCategory;

    private ScanningAudit scanningAudit;

    private String documentName;

    private OCRAudit OCRAudit;

    private BackOfficeAudit backOfficeAudit;

    private String issuingAuthority;

    private String regionCode;

    private String documentRemarks;

    private OtpMobileAudit otpMobileAudit;

    private String effectiveTillDate;

    private String effectiveFromDate;

    private BioMetricAudit bioMetricAudit;

    public SignatureAudit getSignatureAudit ()
    {
        return signatureAudit;
    }

    public void setSignatureAudit (SignatureAudit signatureAudit)
    {
        this.signatureAudit = signatureAudit;
    }

    public ReaderAudit getReaderAudit ()
    {
        return readerAudit;
    }

    public void setReaderAudit (ReaderAudit readerAudit)
    {
        this.readerAudit = readerAudit;
    }

    public String getDocumentExtension ()
    {
        return documentExtension;
    }

    public void setDocumentExtension (String documentExtension)
    {
        this.documentExtension = documentExtension;
    }

    public OtpEmailAudit getOtpEmailAudit ()
    {
        return otpEmailAudit;
    }

    public void setOtpEmailAudit (OtpEmailAudit otpEmailAudit)
    {
        this.otpEmailAudit = otpEmailAudit;
    }

    public String getDocumentCategory ()
    {
        return documentCategory;
    }

    public void setDocumentCategory (String documentCategory)
    {
        this.documentCategory = documentCategory;
    }

    public ScanningAudit getScanningAudit ()
    {
        return scanningAudit;
    }

    public void setScanningAudit (ScanningAudit scanningAudit)
    {
        this.scanningAudit = scanningAudit;
    }

    public String getDocumentName ()
    {
        return documentName;
    }

    public void setDocumentName (String documentName)
    {
        this.documentName = documentName;
    }

    public OCRAudit getOCRAudit ()
    {
        return OCRAudit;
    }

    public void setOCRAudit (OCRAudit OCRAudit)
    {
        this.OCRAudit = OCRAudit;
    }

    public BackOfficeAudit getBackOfficeAudit ()
    {
        return backOfficeAudit;
    }

    public void setBackOfficeAudit (BackOfficeAudit backOfficeAudit)
    {
        this.backOfficeAudit = backOfficeAudit;
    }

    public String getIssuingAuthority ()
    {
        return issuingAuthority;
    }

    public void setIssuingAuthority (String issuingAuthority)
    {
        this.issuingAuthority = issuingAuthority;
    }

    public String getRegionCode ()
    {
        return regionCode;
    }

    public void setRegionCode (String regionCode)
    {
        this.regionCode = regionCode;
    }

    public String getDocumentRemarks ()
    {
        return documentRemarks;
    }

    public void setDocumentRemarks (String documentRemarks)
    {
        this.documentRemarks = documentRemarks;
    }

    public OtpMobileAudit getOtpMobileAudit ()
    {
        return otpMobileAudit;
    }

    public void setOtpMobileAudit (OtpMobileAudit otpMobileAudit)
    {
        this.otpMobileAudit = otpMobileAudit;
    }

    public String getEffectiveTillDate ()
    {
        return effectiveTillDate;
    }

    public void setEffectiveTillDate (String effectiveTillDate)
    {
        this.effectiveTillDate = effectiveTillDate;
    }

    public String getEffectiveFromDate ()
    {
        return effectiveFromDate;
    }

    public void setEffectiveFromDate (String effectiveFromDate)
    {
        this.effectiveFromDate = effectiveFromDate;
    }

    public BioMetricAudit getBioMetricAudit ()
    {
        return bioMetricAudit;
    }

    public void setBioMetricAudit (BioMetricAudit bioMetricAudit)
    {
        this.bioMetricAudit = bioMetricAudit;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [signatureAudit = "+signatureAudit+", readerAudit = "+readerAudit+", documentExtension = "+documentExtension+", otpEmailAudit = "+otpEmailAudit+", documentCategory = "+documentCategory+", scanningAudit = "+scanningAudit+", documentName = "+documentName+", OCRAudit = "+OCRAudit+", backOfficeAudit = "+backOfficeAudit+", issuingAuthority = "+issuingAuthority+", regionCode = "+regionCode+", documentRemarks = "+documentRemarks+", otpMobileAudit = "+otpMobileAudit+", effectiveTillDate = "+effectiveTillDate+", effectiveFromDate = "+effectiveFromDate+", bioMetricAudit = "+bioMetricAudit+"]";
    }
}
			
			