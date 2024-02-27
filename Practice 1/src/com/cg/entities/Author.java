package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(name="tab1", initialValue=0,allocationSize=1)
//@SequenceGenerator(name="seq",initialValue=0,allocationSize=100)
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="tab1")
	private int authorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private long phoneNo;
	
	
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Author(String firstName, String middleName, String lastName, long phoneNo) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}


	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
