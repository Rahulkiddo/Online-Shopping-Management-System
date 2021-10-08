package com.edubridge.admin.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Dealer")
public class Admin {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Dealer_Id")
	private int dealerId;
	@Column(name="Dealer_Name")
	private String dealerName;
	@Column(name="Dealer_Email")
	private String dealerEmail;
	
	public Admin() {}

	public Integer getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerEmail() {
		return dealerEmail;
	}

	public void setDealerEmail(String dealerEmail) {
		this.dealerEmail = dealerEmail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dealerEmail, dealerId, dealerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(dealerEmail, other.dealerEmail) && dealerId == other.dealerId
				&& Objects.equals(dealerName, other.dealerName);
	}

	@Override
	public String toString() {
		return "Admin [dealerId=" + dealerId + ", dealerName=" + dealerName + ", dealerEmail=" + dealerEmail + "]";
	}
	
	

}
