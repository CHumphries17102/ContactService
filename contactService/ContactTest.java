package contactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactID() {
		Contact contact = new Contact("1234");
		assertTrue(contact.getContactID().equals("1234"));
		}

	void testFirstName() {
		Contact contact = new Contact("Collin");
		assertTrue(contact.getFirstName().equals("Collin"));
		}
	
	void testLastName() {
		Contact contact = new Contact("Humphries");
		assertTrue(contact.getLastName().equals("Humphries"));
		
	}
	
	void testPhoneNumber(){
		Contact contact = new Contact("1234567891");
		assertTrue(contact.getPhoneNumber().equals("1234567891"));
	}
	
	void testAddress() {
		Contact contact = new Contact("Knoxville, TN");
		assertTrue(contact.getAddress().equals("Knoxville, TN"));
	}
	
	
}
