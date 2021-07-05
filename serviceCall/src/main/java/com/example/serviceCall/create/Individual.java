package com.example.serviceCall.create;

public class Individual {
	private String firstName;

	private String lastName;

	private String gender;

	private String nationality;

	private String fullNameArabic;

	private String firstNameArabic;

	private String fullNameEnglish;

	private String lastNameArabic;

	private String dateOfBirth;

	private String primaryAccountNumber;

	private String title;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getFullNameArabic() {
		return fullNameArabic;
	}

	public void setFullNameArabic(String fullNameArabic) {
		this.fullNameArabic = fullNameArabic;
	}

	public String getFirstNameArabic() {
		return firstNameArabic;
	}

	public void setFirstNameArabic(String firstNameArabic) {
		this.firstNameArabic = firstNameArabic;
	}

	public String getFullNameEnglish() {
		return fullNameEnglish;
	}

	public void setFullNameEnglish(String fullNameEnglish) {
		this.fullNameEnglish = fullNameEnglish;
	}

	public String getLastNameArabic() {
		return lastNameArabic;
	}

	public void setLastNameArabic(String lastNameArabic) {
		this.lastNameArabic = lastNameArabic;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}

	public void setPrimaryAccountNumber(String primaryAccountNumber) {
		this.primaryAccountNumber = primaryAccountNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "ClassPojo [firstName = " + firstName + ", lastName = " + lastName + ", gender = " + gender
				+ ", nationality = " + nationality + ", fullNameArabic = " + fullNameArabic + ", firstNameArabic = "
				+ firstNameArabic + ", fullNameEnglish = " + fullNameEnglish + ", lastNameArabic = " + lastNameArabic
				+ ", dateOfBirth = " + dateOfBirth + ", primaryAccountNumber = " + primaryAccountNumber + ", title = "
				+ title + "]";
	}
}
