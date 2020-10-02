package com.dxc.flashtrans.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.dxc.flashtrans.FlashTransApplication;
import com.dxc.flashtrans.entites.Registration;


@RunWith(SpringRunner.class)
@SpringBootTest(classes =FlashTransApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)



public class RegistrationTest {
	
	
	
	
	@Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    private String getRootUrl() {
        return "http://localhost:" + port;
    }

    @Test
    public void TestCreateRegistrationTest() {
    	Registration registration =new Registration();
    	registration.setUserName("flash");
    	registration.setPassword("flash@gmail.com");
    	registration.setFirstName("flash");
    	registration.setLastName("Trans");
    	registration.setEmail("flash@gmail.com");
    	registration.setPhoneNumber(999999999);
    	registration.setAccountType("flash");
    	registration.setEmail("flash@gmail.com");
    	registration.setAadharNumber(1234500000);
    	registration.setDateOfBirth("01/02/23");
    	registration.settransactionPin(4444);
    	registration.setGender("male");
  
    	 ResponseEntity<Registration> postResponse = restTemplate.postForEntity(getRootUrl() + "/radd",registration, Registration.class);
	        assertNotNull(postResponse);
	        assertNotNull(postResponse.getBody());
    }

}
