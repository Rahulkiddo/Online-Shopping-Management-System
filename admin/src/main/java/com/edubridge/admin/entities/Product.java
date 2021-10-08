package com.edubridge.admin.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Id")
	private int proId;
	
	@Column(name="Category")
	private String proCategory;
	
	@Column(name ="Brand")
	private String proBrand;
	
	@Column(name ="Name")
	private String proName;
	
	@Column(name ="Price")
	private String proPrice;
	
	@Column(name ="Quantity")
	private String proQuantity;

	public Product() {}

	public Integer getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProCategory() {
		return proCategory;
	}

	public void setProCategory(String proCategory) {
		this.proCategory = proCategory;
	}

	public String getProBrand() {
		return proBrand;
	}

	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProPrice() {
		return proPrice;
	}

	public void setProPrice(String proPrice) {
		this.proPrice = proPrice;
	}

	public String getProQuantity() {
		return proQuantity;
	}

	public void setProQuantity(String proQuantity) {
		this.proQuantity = proQuantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(proBrand, proCategory, proId, proName, proPrice, proQuantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(proBrand, other.proBrand) && Objects.equals(proCategory, other.proCategory)
				&& proId == other.proId && Objects.equals(proName, other.proName)
				&& Objects.equals(proPrice, other.proPrice) && Objects.equals(proQuantity, other.proQuantity);
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proCategory=" + proCategory + ", proBrand=" + proBrand + ", proName="
				+ proName + ", proPrice=" + proPrice + ", proQuantity=" + proQuantity + "]";
	}

	
}
