package com.openclassrooms.safetynetalerts.model;

import java.util.ArrayList;
import java.util.List;

public class AddressListFirestation {

	private String firstName;
	private String lastName;
	private String phone;
	private String old;
	private List<Medications> listMedications = new ArrayList<>();
	private List<Allergies> listAllergies = new ArrayList<>();

	public AddressListFirestation() {
		super();
	}

	public AddressListFirestation(String firstName, String lastName, String phone, String old,
			List<Medications> listMedications, List<Allergies> listAllergies) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.old = old;
		this.listMedications = listMedications;
		this.listAllergies = listAllergies;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOld() {
		return old;
	}

	public void setOld(String old) {
		this.old = old;
	}

	public List<Medications> getListMedications() {
		return listMedications;
	}

	public void setListMedications(List<Medications> listMedications) {
		this.listMedications = listMedications;
	}

	public List<Allergies> getListAllergies() {
		return listAllergies;
	}

	public void setListAllergies(List<Allergies> listAllergies) {
		this.listAllergies = listAllergies;
	}

	@Override
	public String toString() {
		return "AddressListFirestation [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", old=" + old + ", listMedications=" + listMedications + ", listAllergies=" + listAllergies + "]";
	}

}
