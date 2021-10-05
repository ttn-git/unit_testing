package demo.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.Test;
import demo.domain.*;
class EmailServiceTest {

EmailService emailService = EmailService.getInstance();
	
	Order order = new Order(10, "macaw", 60.5);
	
	@SuppressWarnings("unused")
	@Test
	void Should_Throw_RuntimeException() {
		
		//when
		Executable executable = () -> EmailService.sendEmail(order);
		
		//then
		
	}	
	public void assertThrows(Class<RuntimeException> class1, Executable executable) {
		// TODO Auto-generated method stub
	}
	@Test
	void Should_ReturnTrue_When_String_matches_withThatOfOrder() {
		
		//when
		boolean status = emailService.sendEmail(order, "macaw");
		
		//then
		assertTrue(status);
		
	}
	
	@Test
	void Should_ReturnTrue_When_It_Returns_TheInstance() {
		
		
		//when
		EmailService emailService2 = EmailService.getInstance();
		
		//then
		assertEquals(emailService2, emailService);
		
		
	}

}

