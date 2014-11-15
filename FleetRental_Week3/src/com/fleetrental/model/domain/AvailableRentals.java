package com.fleetrental.model.domain;

import java.io.Serializable;
import java.util.ArrayList;



public class AvailableRentals implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -753517717949767546L;

	/** Holds state if rentals are available or not */
	private boolean available;

	/** state tax associated with this rental */
	private float stateTax;
	
	/** holds car objects */
	private ArrayList<Car> availableRentalsList = new ArrayList<Car>(1);
	
	/**ArrayList is not synchronized, so if you need multi-threaded access, consider using: */
	//List availableRentalsList = Collections.synchronizedList(new ArrayList(...)); 


	/**
	 *
	 */
	public AvailableRentals() {

		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param available
	 */
	public AvailableRentals(boolean available) {
		super();
		this.available = available;
	}

	/**
	 * @param available
	 */
	public AvailableRentals(boolean available, float stateTax) 
	{
		super();
		this.available = available;
		this.stateTax = stateTax;
	}
	
	/**
	 *  Add each available rental car into the ArrayList
	 *  
	 * @param car
	 */
	public void addRental(Car car)
	{
		availableRentalsList.add(car);
	}

	
	/**
	 * @return Returns the available.
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available The available to set.
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	
	/**
	 * @param stateTax The stateTax to set.
	 */
	public void setStateTax(float stateTax) {
		this.stateTax = stateTax;
	}

	/**
	 * @return Returns the stateTax.
	 */
	public float getStateTax() {
		return stateTax;
	}

	/**
	 * @return Returns the availableRentalsList.
	 */
	public ArrayList<Car> getAvailableRentalsList() {
		return availableRentalsList;
	}

	/**
	 * @param availableRentalsList The availableRentalsList to set.
	 */
	public void setAvailableRentalsList(ArrayList<Car> availableRentalsList) {
		this.availableRentalsList = availableRentalsList;
	}

	
	
	
	public String toString()
	{
	  StringBuffer stringBuffer = new StringBuffer();
	  
	  if (available)
	  {	  
	    stringBuffer.append("Rental is available");
		stringBuffer.append("\nState Tax: ");
		stringBuffer.append(stateTax);
		stringBuffer.append("\nAvailable Rentals List: ");
		
		for(Car car : availableRentalsList)
		{
			stringBuffer.append(car);
		}
		
	  }	  
	  else
	    stringBuffer.append("No Rental is available");

	  return stringBuffer.toString();
	}

} // end class AvailableRentals