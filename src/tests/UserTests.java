package tests;

import model.User;

public class UserTests {

	public static void main(String[] args) {
		
		/* Manual Testing
		User testUser = new User("mike", "my_passwd", "Mike", "Smith", "0771234567");

		System.out.println(testUser);
	}
}
*/
		
	
	//Automated Testing
	
	//Setup object and test data, initialize
	String test_username = "mike";
	String test_password = "my_passwd";
	String test_first_name = "Mike";
	String test_last_name = "Smith";
	String test_mobile_number = "07771234567";
	
	//Run object under test
	User testUser = new User(test_username, test_password, test_first_name, 
			test_last_name, test_mobile_number);
	
	//Verify
	
	Boolean passed = true;
	
	//Test- username
	if(testUser.getUsername() !=test_username) {
		System.out.println("TC1 failed: username did not match");
		passed = false;
	}
	
	//Test - password
	if(testUser.getPassword() != test_password) {
		System.out.println("TC2 failed: password did not match");
		passed = false;
	}
	
	
	
	//Test- first name
	if(testUser.getFirst_name() != test_first_name) {
		System.out.println("TC3 failed: first name did not match");
		passed = false;
	}
	
	//Test - last name
	if(testUser.getLast_name() != test_last_name) {
		System.out.println("TC4 failed: last name did not match");
		passed = false;
	}
	
	//Test- mobile number
	if(testUser.getMobile_number() != test_mobile_number) {
		System.out.println("TC5 failed: mobile number did not match");
		passed = false;
	}
	
	if(passed)
		System.out.println("All TC's passed.");

	// Asserts
	
	// Failing assert test
	//assert 1==2;
	
	//Assert - username
	assert testUser.getUsername() == test_username;
	

	//Assert - password
	assert testUser.getPassword() == test_password;
	
	//Assert - first name
	assert testUser.getFirst_name() == test_first_name;
	
	//Assert - last name 
	assert testUser.getLast_name() == test_last_name;
	
	//Assert - mobile number
	assert testUser.getMobile_number() == test_mobile_number;
	
	System.out.println("All Java assertions in the test suite have passed. (None Failed). ");
	
	}
}
	

