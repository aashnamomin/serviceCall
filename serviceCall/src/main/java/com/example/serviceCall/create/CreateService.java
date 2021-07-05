package com.example.serviceCall.create;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.xml.sax.InputSource;

import com.example.serviceCall.Dto.BaseDto;
import com.example.serviceCall.exceptions.ExternalServiceException;

@Service
public class CreateService {

	@Autowired
	private RestTemplate restTemplate;

	public BaseDto CreateTransaction(BaseDto baseDto, Class<?> reqclass, Class<?> responseClass) throws Exception{

		String exceptionMsg = "";
		String baseUrl = "http://localhost:8080/add/employee";
		HttpHeaders requestHeaders = new HttpHeaders();
		ByteArrayOutputStream request = new ByteArrayOutputStream();
		JAXBContext jaxbContextReq = JAXBContext.newInstance(reqclass);
		Marshaller jaxbMarshaller = jaxbContextReq.createMarshaller();
		jaxbMarshaller.marshal(baseDto, request);

		// sending request
		String params = new String(request.toString());
		requestHeaders.set("content-type", "application/xml");
		requestHeaders.set("accept", "application/xml");
		HttpEntity<String> entity = new HttpEntity<>(params, requestHeaders);
		ResponseEntity<String> responseEntity;
		try {
			responseEntity = restTemplate.exchange(baseUrl, HttpMethod.POST, entity, String.class);
		} catch (Exception e) {
			exceptionMsg = e.getLocalizedMessage();
			e.printStackTrace();
			throw new ExternalServiceException(exceptionMsg);
		}
		

		InputSource is = new InputSource(new StringReader(responseEntity.getBody().toString()));
		JAXBContext jaxbContextResp = JAXBContext.newInstance(responseClass);
		Unmarshaller jaxbUnmarshaller = jaxbContextResp.createUnmarshaller();

		return (BaseDto) jaxbUnmarshaller.unmarshal(is);

	}

	/*
	 * public CreateRequest buildCreateRequest(boolean isRequest1) { CreateRequest
	 * createRequest = new CreateRequest(); createRequest.setRequest(isRequest1 ?
	 * createRequest1() : createRequest2()); return createRequest; }
	 */

	private Request createRequest1() {
		Request request = new Request();
		request.setChannel("DIGITALAPP");
		request.setLanguage("EN");
		request.setOperation("NEW");
		request.setPriority("10");
		request.setProcessCode("PRS000011");
		request.setUserId("DIGITALAPP");
		request.setParty(createParty());
		request.setRequestDocuments(createRequestDocuments());
		return request;
	}

	public Request2 createRequest2() {
		Request2 request = new Request2();
		request.setChannel("DIGITALAPP");
		request.setLanguage("EN");
		request.setRequestDocuments(createRequestDocuments());
		return request;
	}

	private Party createParty() {
		Party party = new Party();
		party.setEmirate("DXB");
		party.setPreferredLanguage("English");
		party.setAddresses(createAddresses());
		party.setIndividual(createIndividual());
		party.setProfiles(createProfiles());
		party.setProspect("false");
		party.setSegment("CONSUMER");
		party.setContacts(createContacts());
		return party;
	}

	private Contacts createContacts() {
		Contacts contacts = new Contacts();
		contacts.setContact(createContact());
		return contacts;
	}

	private List<Contact> createContact() {
		List<Contact> contact = new ArrayList<>();
		// for(Contact contact1 = ?)
		Contact contact1 = new Contact();
		contact1.setContactValue("0544044389");
		contact1.setIsPrimary("false");
		contact1.setPersonName("NASER SALEM NASER BINKHADEM ALSHAMSI");
		contact1.setPreferredLang("English");
		contact1.setPriority("2");
		contact1.setTeleMarketing("true");
		contact1.setType("Mobile");
		contact.add(contact1);
		return contact;
	}

	private Addresses createAddresses() {
		Addresses addresses = new Addresses();
		addresses.setAddress(createAddress());
		return addresses;
	}

	private Address createAddress() {
		Address address = new Address();
		address.setAddressLine1Arabic("RUWAIS");
		address.setAddressLine1English("RUWAIS");
		address.setEmirates("AUH");
		address.setCity("AU");
		address.setIsNewAddress("false");
		address.setIsNewLocation("false");
		address.setIsPrimaryAddress("false");
		address.setPoBox("000");
		address.setType("1");
		return address;
	}

	private Individual createIndividual() {
		Individual individual = new Individual();
		individual.setDateOfBirth("1984/05/30 00:00:00");
		individual.setFirstName("Nikhil Thozhuthungal");
		individual.setFirstNameArabic("نبكيل ثوزوثونجال");
		individual.setFullNameArabic("نبكيل ثوزوثونجال ناندانان");
		individual.setFullNameEnglish("Nikhil Thozhuthungal Nandanan");
		individual.setGender("Male");
		individual.setLastName("Nandanan");
		individual.setLastNameArabic("ناندانان");
		individual.setNationality("India");
		individual.setPrimaryAccountNumber("0543935776");
		individual.setTitle("Mr.");
		return individual;
	}

	private Profiles createProfiles() {
		Profiles profiles = new Profiles();
		profiles.setProfile(createProfile());
		return profiles;
	}

	private Profile createProfile() {
		Profile profile = new Profile();
		profile.setPartyProfileSubType("YOUTH");
		profile.setPartyProfileType("Customer");
		profile.setStatus("ACTIVE");
		return profile;
	}

	private RequestDocuments createRequestDocuments() {
		RequestDocuments requestDocuments = new RequestDocuments();
		requestDocuments.setRequestDocument(createRequestDocument());
		return requestDocuments;
	}

	private RequestDocument createRequestDocument() {
		RequestDocument requestDocument = new RequestDocument();
		requestDocument.setDocumentOwner("CUSTOMER");
		requestDocument.setDocumentStream("JVBERi0xLjYNQpzdGFydHhyZWYNCjE4MDY1Ng0KJSVFT0YNCg==");
		requestDocument.setDocumentType("UAE Identity card");
		requestDocument.setDocumentValue("78419850000008575846");
		requestDocument.setDocumentDetails(createDocumentDetails());
		return requestDocument;
	}

	private DocumentDetails createDocumentDetails() {
		DocumentDetails DocumentDetails = new DocumentDetails();
		DocumentDetails.setBackOfficeAudit(createBackOfficeAudit());
		DocumentDetails.setBioMetricAudit(createBioMetricAudit());
		DocumentDetails.setDocumentCategory("PA");
		DocumentDetails.setDocumentExtension("pdf");
		DocumentDetails.setDocumentName("784198500008575846");
		DocumentDetails.setDocumentRemarks("EID");
		DocumentDetails.setEffectiveFromDate("2021-05-16");
		DocumentDetails.setEffectiveTillDate("2022-02-22");
		DocumentDetails.setIssuingAuthority("UAE Emirates ID Authority");
		DocumentDetails.setOCRAudit(createOCRAudit());
		DocumentDetails.setOtpEmailAudit(createOtpEmailAudit());
		DocumentDetails.setOtpMobileAudit(createOtpMobileAudit());
		DocumentDetails.setReaderAudit(createReaderAudit());
		DocumentDetails.setRegionCode(null);
		DocumentDetails.setScanningAudit(createScanningAudit());
		DocumentDetails.setSignatureAudit(createSignatureAudit());

		return DocumentDetails;
	}

	private BackOfficeAudit createBackOfficeAudit() {
		BackOfficeAudit backOfficeAudit = new BackOfficeAudit();
		backOfficeAudit.setIsVerified("true");
		backOfficeAudit.setNotes("notes");
		backOfficeAudit.setVerificationResult("success");
		backOfficeAudit.setVerifyerUserId("admin");
		return backOfficeAudit;
	}

	private ReaderAudit createReaderAudit() {
		ReaderAudit readerAudit = new ReaderAudit();
		readerAudit.setBypassApprovedUserId("admin");
		readerAudit.setBypassReason("Document Reader Bypass Verification");
		readerAudit.setIsVerified("true");
		return readerAudit;
	}

	private BioMetricAudit createBioMetricAudit() {
		BioMetricAudit bioMetricAudit = new BioMetricAudit();
		bioMetricAudit.setBypassApprovedUserId("admin");
		bioMetricAudit.setBypassReason("Biometric Bypass Verification");
		bioMetricAudit.setIsVerified("true");
		bioMetricAudit.setVerificationMode("EIDA");

		return bioMetricAudit;
	}

	private OCRAudit createOCRAudit() {
		OCRAudit OCRAudit = new OCRAudit();
		OCRAudit.setBypassApprovedUserId("admin");
		OCRAudit.setBypassReason("Biometric Bypass Verification");
		OCRAudit.setIsVerified("true");
		return OCRAudit;
	}

	private ScanningAudit createScanningAudit() {
		ScanningAudit scanningAudit = new ScanningAudit();
		scanningAudit.setBypassApprovedUserId("admin");
		scanningAudit.setBypassReason("Biometric Bypass Verification");
		scanningAudit.setIsVerified("true");
		return scanningAudit;
	}

	private SignatureAudit createSignatureAudit() {
		SignatureAudit signatureAudit = new SignatureAudit();
		signatureAudit.setIsVerified("true");
		signatureAudit.setVerificationSignature("31313212");
		return signatureAudit;
	}

	private OtpMobileAudit createOtpMobileAudit() {
		OtpMobileAudit otpMobileAudit = new OtpMobileAudit();
		otpMobileAudit.setIsVerified("true");
		otpMobileAudit.setVerificationValue("31313212");
		return otpMobileAudit;
	}

	private OtpEmailAudit createOtpEmailAudit() {
		OtpEmailAudit otpEmailAudit = new OtpEmailAudit();
		otpEmailAudit.setIsVerified("true");
		otpEmailAudit.setVerificationValue("mmmams@etisalat.ae");
		return otpEmailAudit;
	}
}
