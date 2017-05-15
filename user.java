import java.io.*;					//import all of java
//user object
class user {
  
	/* This next section is declaring all the instance variables
		We don't initialise them here.  If need be you can initialise them
		in the constructor method which we will talk about later. */
	//Declare a private String called firstName
	private String firstName;
	//Declare a private String called lastName
	private String lastName;
	//Declare a private String called phoneNumber
	private String phoneNumber;
	//Declare a private String called email
	private String intel;
	/* This next section is all the accessor and mutator methods
	   Each method will require multiple lines of code.  See the Dog class
	   for an example. */
	//Create the accessor method for firstName
	public String getFirstName()
	{
		return firstName;
	}
	//Create the mutator method for firstName
	public void setFirstName(String tmpFirstName)
	{
		firstName = tmpFirstName;
	}
	//Create the accessor method for lastName
	public String getLastName()
	{
		return lastName;
	}
	//Create the mutator method for lastName
	public void setLastName(String tmpLastName)
	{
		lastName = tmpLastName;
	}
	//Create the accessor method for phoneNumber
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	//Create the mutator method for phoneNumber
	public void setPhoneNumber(String tmpPhoneNumber)
	{
		phoneNumber = tmpPhoneNumber;
	}
	//Create the accessor method for email
	public String getIntel()
	{
		return intel;
	}
	//Create the mutator method for email
	public void setIntel(String tmpIntel)
	{
		intel = tmpIntel;
	}
}
