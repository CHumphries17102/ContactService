package contactService;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	ArrayList<Contact> contacts;
	@Test
	void test() {
		 contacts = new ArrayList<>();
    }

    

        // The contact service shall be able to add contacts with a unique ID
        public boolean addContact(Contact newContact) {
        		boolean contains = false;
                for (Contact c : contacts) {
                        if ((( c.getContactID().equalsIgnoreCase(newContact.getContactID())))) {
                                contains = true;
                                break;
                        }
                }

                if (!contains) {
                        contacts.add(newContact);
                        System.out.println("Contract added.");
                        return true;
                } else {
                		System.out.println("Error adding contract.");
                        return false;
                }
        }

        // The contact service shall be able to delete contacts per contact ID.
        public boolean deleteContact(String contactID) {
                boolean deleted = false;
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(contactID)) {
                                contacts.remove(c);
                                deleted = true;
                                break;
                        }
                }
                System.out.println("Contact deleted.");
                return deleted;
        }

        // Update First name for the given contact ID
        public boolean updateContactFirstName(String contactID, String newFirstName) {
                boolean updated = false;
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(contactID)) {
                                c.FirstName(newFirstName);
                                updated = true;
                                break;
                        }
                }
                System.out.println("First name updated.");
                return updated;
        }

        // Update Last name for the given contact ID
        public boolean updateContactLastName(String contactID, String newLastName) {
                boolean updated = false;
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(contactID)) {
                                c.setLastName(newLastName);
                                updated = true;
                                break;
                        }
                }
                System.out.println("Last name updated.");
                return updated;
        }

        // Update number for the given contact ID
        public boolean updateContactNumber(String contactID, String newNumber) {
                boolean updated = false;
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(contactID)) {
                                c.setPhoneNumber(newNumber);
                                updated = true;
                                break;
                        }
                }
                System.out.println("Phone number updated.");
                return updated;
        }

        // Update Address for the given contact ID
        public boolean updateContactAddress(String contactID, String newAddress) {
                boolean updated = false;
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(contactID)) {
                                c.setAddress(newAddress);
                                updated = true;
                                break;
                        }
                }
                System.out.println("Address updated.");
                return updated;
        }
        
        // Print all the contacts
        public void displayAllContacts() {
                for(Contact c: contacts) {
                        System.out.println(c.toString());
                }
        }
        
}


