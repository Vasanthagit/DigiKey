 import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SignUpPageTesting { 
	
	private SignUpPage signup;
	
	@Before
	public void setUp()
	{ 
		signup = new  SignUpPage();
		
	}
	@Test  
	//Testcase 1 with valid credentials  across all pages 
	public void testValidSignUp()
{
	signup.setFirstName("Vasantha");
	signup.setLastName(" Bhukya");
	signup.setEmail("vasanthabhukya101@gmail.com");
	signup.setPassword("Vasa12345");
	signup.setConfirmPassword("Vasa12345");
	signup.setPhoneNumber("1234567890");
	 signup.setCountry("India");
	 signup.setCurrency("INR");
	 signup.setMailStop("vasanthabhukya101@gmail.com");
	 signup.setAddressLine1("Warangal");
	 signup.setAddressLine2("Ramanna Colony");
	 signup.setCity("Warangal");
	 signup.setState("Telangana");
	 
	 signup.setPostalCode("506009");
	 signup.setVerificationCode("123456");
	 boolean result = signup.submit();
	 assertTrue(result);
	 		
}
	 
//testcase2: Invalid Email 
	 @Test
	 public void testInvalidEmail()
{ 
		
		 signup.setFirstName("Vasantha");
		 signup.setLastName("Bhukya");
		 signup.setEmail("vasanthabhukya.com");
		 signup.setPassword("Vasa12345");
		 signup.setConfirmPassword("Vasa12345");
		 signup.setPhoneNumber("1234567890"); 
		 signup.setCountry("India");
		 signup.setCurrency("INR");
		 signup.setMailStop("vasanthabhukya.com");
		 signup.setAddressLine1("Warangal");
		 signup.setAddressLine2("Ramanna Colony");
		 signup.setCity("Warangal");
		 signup.setState("Telangana");
		 
		 signup.setPostalCode("506009");
		 signup.setVerificationCode("123456");
		 
	
		 
		 
		  boolean result = signup.submit();
		  assertFalse(result);
}

	//testcase3:Password is too short 
	 @Test 
	
	 public void testShortPassword()
{ 
		 signup.setFirstName("Vasantha");
			signup.setLastName(" Bhukya");
			signup.setEmail("vasanthabhukya101@gmail.com");
			signup.setPassword("Vasa");
			signup.setConfirmPassword("Vasa");
			signup.setPhoneNumber("1234567890");
			 signup.setCountry("India");
			 signup.setCurrency("INR");
			 signup.setMailStop("vasanthabhukya101@gmail.com");
			 signup.setAddressLine1("Warangal");
			 signup.setAddressLine2("Ramanna Colony");
			 signup.setCity("Warangal");
			 signup.setState("Telangana");
			 
			 signup.setPostalCode("506009");
			 signup.setVerificationCode("123456");
		 
		  boolean result = signup.submit();
		  assertFalse(result);
}   
	 
	 //TestCase4: Missing firstName on page1
	 
	
	 @Test
	 public void testIMissingName()
{ 
		
		 signup.setFirstName("");
			signup.setLastName(" Bhukya");
			signup.setEmail("vasanthabhukya101@gmail.com");
			signup.setPassword("Vasa12345");
			signup.setConfirmPassword("Vasa12345");
			signup.setPhoneNumber("1234567890");
			 signup.setCountry("India");
			 signup.setCurrency("INR");
			 signup.setMailStop("vasanthabhukya101@gmail.com");
			 signup.setAddressLine1("Warangal");
			 signup.setAddressLine2("Ramanna Colony");
			 signup.setCity("Warangal");
			 signup.setState("Telangana");
			 
			 signup.setPostalCode("506009");
			 signup.setVerificationCode("123456");
		  boolean result = signup.submit();
		  assertFalse(result);
}  
	 //TestCase5:Invalid PhoneNumber 
	 
	  
	 @Test
	 public void testInvaliPhoneNumber()
{ 
		
		 signup.setFirstName("Vasantha");
			signup.setLastName(" Bhukya");
			signup.setEmail("vasanthabhukya101@gmail.com");
			signup.setPassword("Vasa12345");
			signup.setConfirmPassword("Vasa12345");
			signup.setPhoneNumber("1234");
			 signup.setCountry("India");
			 signup.setCurrency("INR");
			 signup.setMailStop("vasanthabhukya101@gmail.com");
			 signup.setAddressLine1("Warangal");
			 signup.setAddressLine2("Ramanna Colony");
			 signup.setCity("Warangal");
			 signup.setState("Telangana");
			 
			 signup.setPostalCode("506009");
			 signup.setVerificationCode("123456");
		  boolean result = signup.submit();
		  assertFalse(result);
	 
}   
	 public void testMissingAddress() 
	 {
		 
		 
		 signup.setFirstName("Vasantha");
			signup.setLastName(" Bhukya");
			signup.setEmail("vasanthabhukya101@gmail.com");
			signup.setPassword("Vasa12345");
			signup.setConfirmPassword("Vasa12345");
			signup.setPhoneNumber("1234567890");
			 signup.setCountry("India");
			 signup.setCurrency("INR");
			 signup.setMailStop("vasanthabhukya101@gmail.com");
			 signup.setAddressLine1("");
			 signup.setAddressLine2("");
			 signup.setCity("Warangal");
			 signup.setState("Telangana");
			 
			 signup.setPostalCode("506009");
			 signup.setVerificationCode("123456"); 
			 boolean result = signup.submit();
			  assertFalse(result);
	 }
	 
	 
	 
	 //testcase7:Invalid verification code 
	 public void testInvalidVerificationCode() 
	 {
		 signup.setFirstName("Vasantha");
			signup.setLastName(" Bhukya");
			signup.setEmail("vasanthabhukya101@gmail.com");
			signup.setPassword("Vasa12345");
			signup.setConfirmPassword("Vasa12345");
			signup.setPhoneNumber("1234567890");
			 signup.setCountry("India");
			 signup.setCurrency("INR");
			 signup.setMailStop("vasanthabhukya101@gmail.com");
			 signup.setAddressLine1("Warangal");
			 signup.setAddressLine2("Ramanna Colony");
			 signup.setCity("Warangal");
			 signup.setState("Telangana");
			 
			 signup.setPostalCode("506009");
			 signup.setVerificationCode("56"); 
			 boolean result = signup.submit();
			  assertFalse(result);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //TestCase8: Missing  all Details  
	 
	 @Test
	 public void testMissingAllFields()
{ 
		 signup.setFirstName("");
			signup.setLastName(" ");
			signup.setEmail(" ");
			signup.setPassword(" ");
			signup.setConfirmPassword(" ");
			signup.setPhoneNumber("");
			 signup.setCountry("");
			 signup.setCurrency("");
			 signup.setMailStop("");
			 signup.setAddressLine1("");
			 signup.setAddressLine2("");
			 signup.setCity("");
			 signup.setState("");
			 
			 signup.setPostalCode("");
			 signup.setVerificationCode("");
		 
		  boolean result = signup.submit();
		  assertFalse(result);
}
}
