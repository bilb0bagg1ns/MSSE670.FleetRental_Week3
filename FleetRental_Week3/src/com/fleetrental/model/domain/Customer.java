/**
 * 
 */
package com.fleetrental.model.domain;

import java.io.Serializable;

/**
 * @author mike.prasad
 *
 */

public class Customer implements Serializable
{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 7661657477853633935L;


	/** Customer last name */
	  private String lastName;
	  
	  /** Customer first name */
	  private String firstName;
	  
	  /** Customer email address */
	  private String emailAddress;
	  
	  /** Customer password */
	  private String password;
	  
	  /** Customer day phone */
	  private String dayTimePhone;
	  
	  /** Customer evening phone */
	  private String eveningTimePhone;

	  
	  public Customer() 
	  {
	  }  
	  
	/**
	 * Copy Constructor
	 *
	 * @param customer a <code>Customer</code> object
	 */
	public Customer(Customer customer) 
	{
	    this.lastName = customer.lastName;
	    this.firstName = customer.firstName;
	    this.emailAddress = customer.emailAddress;
	    this.password = customer.password;
	    this.dayTimePhone = customer.dayTimePhone;
	    this.eveningTimePhone = customer.eveningTimePhone;
	}

	/**
	 * @param lastName
	 * @param firstName
	 * @param emailAddress
	 */
	public Customer(String lastName, String firstName, String emailAddress, String password, String dayTimePhone, String eveningTimePhone)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailAddress = emailAddress;
		this.password = password;
		this.dayTimePhone = dayTimePhone;
		this.eveningTimePhone = eveningTimePhone;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}



	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return the dayTimePhone
	 */
	public String getDayTimePhone() {
		return dayTimePhone;
	}



	/**
	 * @param dayTimePhone the dayTimePhone to set
	 */
	public void setDayTimePhone(String dayTimePhone) {
		this.dayTimePhone = dayTimePhone;
	}



	/**
	 * @return the eveningTimePhone
	 */
	public String getEveningTimePhone() {
		return eveningTimePhone;
	}



	/**
	 * @param eveningTimePhone the eveningTimePhone to set
	 */
	public void setEveningTimePhone(String eveningTimePhone) {
		this.eveningTimePhone = eveningTimePhone;
	}

	/**
	 * 
	 * @return
	 */
	public boolean validate () 
	{
		if (lastName == null) return false;
		if (firstName == null) return false;
		if (emailAddress == null) return false;
		if (password == null) return false;
		if (dayTimePhone == null) return false;
		if (eveningTimePhone == null) return false;
	   
		return true;
	}

	/**
	 * 
	 * @param Customer
	 * @return
	 */
	public boolean equals(Customer customer) 
	{
		if (!lastName.equals(customer.getLastName())) return false;
		if (!firstName.equals(customer.getFirstName())) return false;
		if (!emailAddress.equals(customer.getEmailAddress())) return false;
		if (!password.equals(customer.getPassword())) return false;
		if (!dayTimePhone.equals(customer.getDayTimePhone())) return false;
		if (!eveningTimePhone.equals(customer.getEveningTimePhone())) return false;

		return true;
	}

	/**
	 * Constructs a <code>String</code> with all attributes
	 * in name = value format.
	 *
	 * @return a <code>String</code> representation 
	 * of this object.
	 */
	public String toString()
	{
	    final String TAB = "    ";
	    
	    String retValue = "";
	    
	    retValue = "Customer ( "
	        + super.toString() + TAB
	        + "lastName = " + this.lastName + TAB
	        + "firstName = " + this.firstName + TAB
	        + "emailAddress = " + this.emailAddress + TAB
	        + "password = " + this.password + TAB
	        + "dayTimePhone = " + this.dayTimePhone + TAB
	        + "eveningTimePhone = " + this.eveningTimePhone + TAB
	        + " )";
	
	    return retValue;
	}
	  
	
	
	  
	  
}
