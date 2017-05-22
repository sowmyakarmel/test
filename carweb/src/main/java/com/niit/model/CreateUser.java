package com.niit.model;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Pattern;
	import javax.validation.constraints.Size;

	import org.hibernate.validator.constraints.Length;

	@SuppressWarnings("serial")
	@Table
	@Entity 
	public class CreateUser implements Serializable 
	{
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int userid;
		@Column(unique=true)
		@Pattern(regexp=".+@.+\\..+", message="Invalid email!")
		private String email;
		@Size(min=5, max=10, message="your name should be between 5-10 characters.")
		private String myname;
		private boolean is_active;
		
		public boolean isIs_active() {
			return is_active;
		}
		public void setIs_active(boolean is_active) {
			this.is_active = is_active;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@NotNull(message="should not be empty")
		@Length(min=5, max=10, message="Password should be between 5-10 characters")
		private String password;
		@Size(min=10, message="you cannot entered less than 10 digits.")
		private String contactno;
		private String role;
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		
		
		public String getMyname() {
			return myname;
		}
		public void setMyname(String myname) {
			this.myname = myname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getContactno() {
			return contactno;
		}
		public void setContactno(String contactno) {
			this.contactno = contactno;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		
	}
