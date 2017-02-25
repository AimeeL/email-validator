package csci3130a3.email_validator;

import org.junit.Test;

import junit.framework.TestCase;

public class EmailValidatorTest extends TestCase {
	
	@Test
	public void testConstructor(){
		EmailValidator validator=new EmailValidator();
		assertNotNull(validator);
	}
	
	@Test
	public void testAt1(){
		EmailValidator validator=new EmailValidator();
		boolean report=true;
		String ex1="try@test.com";
		boolean r=validator.justOneAt(ex1);
		assertFalse(r != report);
	}
	
	@Test
	public void testAtNull(){
		EmailValidator validator=new EmailValidator();
		boolean report=false;
		String ex1="trytest.com";
		boolean r=validator.justOneAt(ex1);
		assertFalse(r != report);
	}
	
	@Test
	public void testAtMore(){
		EmailValidator validator=new EmailValidator();
		boolean report=false;
		String ex1="try@@test.com";
		boolean r=validator.justOneAt(ex1);
		assertFalse(r != report);
	}
	
	@Test
	public void testPoint1(){
		EmailValidator validator=new EmailValidator();
		boolean report=true;
		String ex1="try@test.com";
		boolean r=validator.moreonePoint(ex1);
		assertFalse(r != report);
	}
	
	@Test
	public void testPointNull(){
		EmailValidator validator=new EmailValidator();
		boolean report=false;
		String ex1="try@testcom";
		boolean r=validator.moreonePoint(ex1);
		assertFalse(r != report);
	}
	
	@Test
	public void testPointMore(){
		EmailValidator validator=new EmailValidator();
		boolean report=true;
		String ex1="try@test..com";
		boolean r=validator.moreonePoint(ex1);
		assertFalse(r != report);
	}
	
	@Test
	public void testIsValidate(){
		EmailValidator validator=new EmailValidator();
		boolean report=true;
		String ex1="try@test.com";
		boolean r=validator.isValidate(ex1);
		assertFalse(r != report);
	}
	
	@Test
	public void testIsLowerCase(){
		EmailValidator validator=new EmailValidator();
		boolean report=true;
		String ex1="trytestcom";
		boolean r=validator.isLowerCase(ex1);
		assertFalse(r != report);
	}

	@Test
	public void testIsLonger10(){
		EmailValidator validator=new EmailValidator();
		boolean report=true;
		String ex1="try@test.com";
		boolean r=validator.isLonger10(ex1);
		assertFalse(r != report);
	}
}
