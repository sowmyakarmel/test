package com.niit.model;

import javax.persistence.Transient;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

@SuppressWarnings("serial")
@Entity

public class Product implements Serializable
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int productId;
@Size(min=3,max=20,message="min 3 characters and max 20 characters")
private String productName;
@Size(min=1,max=1000,message="The product price should be between 1 and 100 ")
private String productPrice;
@Size(min=1,max=100,message="The product description should not exceed 100 characters")
private String productDescription;
@Size(min=1,max=100,message="minimum quantity should be 1")
private int quantity;

@Transient
private MultipartFile image;
private boolean status;
@ManyToOne(cascade=CascadeType.ALL)
private Category categoryId;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}

public String getProductPrice() {
	return productPrice;
}
public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public MultipartFile getImage() {
	return image;
}
public void setImage(MultipartFile image) {
	this.image = image;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public Category getCategoryId() {
	return categoryId;
}
public void setCategoryId(Category categoryId) {
	this.categoryId = categoryId;
}

}
