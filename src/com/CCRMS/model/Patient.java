
package com.CCRMS.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity

@Table(name = "Patient_Details")
public class Patient {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String AadharId;

	@Column
	private String Name;

	@Column
	private String State;

	@Column
	private String City;

	@Column
	private String PinCode;

	@Column
	private String Status;

	@Override
	public String toString() {
		return "Patient [id=" + id + ", AadharId=" + AadharId + ", Name=" + Name + ", State=" + State + ", City=" + City
				+ ", PinCode=" + PinCode + ", Status=" + Status + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAadharId() {
		return AadharId;
	}

	public void setAadharId(String aadharId) {
		AadharId = aadharId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getState() {
		return State;
	}

	public void setState(String state2) {
		State = state2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getPinCode() {
		return PinCode;
	}

	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	

}
