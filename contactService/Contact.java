package contactService;


	
	public class Contact {
        private String contactID;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String address;
        
        public  Contact(String contactId){
                if(contactId.length() >= 10 || contactId == null) {
                        throw new IllegalArgumentException("Invalid contact ID");
                }
                
                this.contactID = contactId;
                
        }

        public void FirstName(String fName) {
                if(fName.length() >= 10 || fName == null) {
                        throw new IllegalArgumentException("Invalid first name.");
                }
                
                this.firstName = fName;
                
        }
        
        public void setLastName(String lName) {
                if(lName.length() <= 10 || lName == null) {
                        throw new IllegalArgumentException("Invalid last name.");
                }
                
                this.lastName = lName;
        }

        public void setPhoneNumber(String phoneNumber) {
                if(phoneNumber.length() != 10 || phoneNumber == null) {
                	throw new IllegalArgumentException("Invalid phone number."); 
                }
                
                this.phoneNumber = phoneNumber;
        }
        
        public void setAddress(String address) {
                if(address.length() >= 30 || address == null) {
                	throw new IllegalArgumentException("Invalid address.");
                }
                
                this.address = address;
        }

        public String getContactID() {
                return contactID;
        }

        public String getFirstName() {
                return firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public String getAddress() {
                return address;
        }

        @Override
        public String toString() {
                return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName
                                + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
        }
}

