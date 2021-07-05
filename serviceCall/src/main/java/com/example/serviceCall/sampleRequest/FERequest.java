/*
 * package com.example.serviceCall.sampleRequest;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * 
 * class Request1 { private String transactionId; private Party party;
 * 
 * public Request1(String transactionId, Party party) { super();
 * this.transactionId = transactionId; this.party = party; } protected String
 * getTransactionId() { return transactionId; } protected void
 * setTransactionId(String transactionId) { this.transactionId = transactionId;
 * } protected Party getParty() { return party; } protected void setParty(Party
 * party) { this.party = party; } }
 * 
 * class Party { private int partyId; private String partyName;
 * 
 * public Party(int partyId, String partyName) { super(); this.partyId =
 * partyId; this.partyName = partyName; } protected int getPartyId() { return
 * partyId; } protected void setPartyId(int partyId) { this.partyId = partyId; }
 * protected String getPartyName() { return partyName; } protected void
 * setPartyName(String partyName) { this.partyName = partyName; }
 * 
 * 
 * }
 * 
 * class Request2 { private String transactionId; private String channel;
 * private Party2 party; private Addresses addresses;
 * 
 * 
 * 
 * public Request2(String transactionId, String channel, Party2 party, Addresses
 * addresses) { super(); this.transactionId = transactionId; this.channel =
 * channel; this.party = party; this.setAddresses(addresses); } protected String
 * getTransactionId() { return transactionId; } protected void
 * setTransactionId(String transactionId) { this.transactionId = transactionId;
 * } protected Party2 getParty() { return party; } protected void
 * setParty(Party2 party) { this.party = party; } public String getChannel() {
 * return channel; } public void setChannel(String channel) { this.channel =
 * channel; } public Addresses getAddresses() { return addresses; } public void
 * setAddresses(Addresses addresses) { this.addresses = addresses; } }
 * 
 * class Addresses { private String addressName;
 * 
 * public Addresses(String addressName) { super(); this.addressName =
 * addressName; }
 * 
 * public String getAddressName() { return addressName; }
 * 
 * public void setAddressName(String addressName) { this.addressName =
 * addressName; } }
 * 
 * class Party2 { private int partyId; private String partyName; private String
 * partyNumber;
 * 
 * 
 * 
 * public Party2(int partyId, String partyName, String partyNumber) { super();
 * this.partyId = partyId; this.partyName = partyName; this.partyNumber =
 * partyNumber; } protected int getPartyId() { return partyId; } protected void
 * setPartyId(int partyId) { this.partyId = partyId; } protected String
 * getPartyName() { return partyName; } protected void setPartyName(String
 * partyName) { this.partyName = partyName; } public String getPartyNumber() {
 * return partyNumber; } public void setPartyNumber(String partyNumber) {
 * this.partyNumber = partyNumber; }
 * 
 * 
 * }
 * 
 * public class FERequest {
 * 
 * @Autowired private CreateService createService;
 * 
 * private void createRequestController1() {
 * createService.callCreateTransaction(new Request1("123", new Party(1, "abc")),
 * Request1.class); }
 * 
 * private Request2 createRequestController2() { return new Request2("123",
 * "T1", new Party2(1, "AFX", "AFX1"), new Addresses("Dubai")); } }
 */