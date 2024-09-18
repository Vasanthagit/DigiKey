

public class SignUpPage { 
	
	private String firstName ;
	private String lastName;
	private String email;
	private String password; 
	private String confirmPassword;
	private String phoneNumber = "";  
	 private  String country;
	 private String currency;
	 private String mailStop;
	 private String addressLine1;
	 private String addressLine2;
	 private String city;
	 private String state;
	 private String postalCode;
	 private String verificationCode;
	 
	
	
	public void setFirstName( String firstName)
{
	this.firstName = firstName;

}  
	public void setLastName(String lastName) 
	{ 
		this.lastName = lastName ;
	}
	
	
	public void setEmail( String email)
	{
		this.email = email;
	} 
	public void setPassword ( String password){ 
		this.password = password;
		
	}  
	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}
	public void setPhoneNumber( String PhoneNumber)
	{
		this.phoneNumber = phoneNumber; 
		
		
	}  
	 public void setCountry( String country) 
{
	 this.country = country;
}
	
public void setCurrency(String currency)	
{
	this.currency = currency;
	
}
	public void setMailStop(String mailStop)
	{
		this.mailStop = mailStop;
	}
	
	public void setAddressLine1( String addressLine1)
	{ 
		this.addressLine1 = addressLine1;
	}
	 public void setAddressLine2( String addressLine2)
		{ 
			this.addressLine2 = addressLine2;
		}
	
	public void setCity(String city) 
{
		this.city = city;
		
}
	
	public void setState(String state) 
	{
		this.state = state ;
	}
	
	
	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}
	
	
	public void setVerificationCode(String verificationCode) 
	{ 
		this.verificationCode = verificationCode;
	}
	
	
	
	
	
	
	
	//page1 validation 
	public boolean isPage1Valid( )
	
	{
		 return !firstName.isEmpty()&&!lastName.isEmpty()&&email.contains("@")&&email.contains(".")&& password != null &&password.equals(confirmPassword)&&phoneNumber.length()==10;
	}
	 //page2 validation
	 
	public boolean isPage2Valid() 
	{
		return !country.isEmpty()&&currency.isEmpty()&& !addressLine1.isEmpty()&&!state.isEmpty()&& !city.isEmpty()&&postalCode.length()>0;
	}
	//page3Validation 
	public boolean isPage3Valid()
{ 
		return verificationCode!=null&&verificationCode.length()==6;
}
	
	public boolean submit() 
	{
		return  isPage1Valid()&&isPage2Valid()&&isPage3Valid();
	}

}


