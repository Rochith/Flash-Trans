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
import com.dxc.flashtrans.entites.AdminLogin;


@RunWith(SpringRunner.class)
@SpringBootTest(classes =FlashTransApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class AdminLoginTest {
	
	@Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    private String getRootUrl() {
        return "http://localhost:" + port;
    }

    @Test
    public void TestCreateAdminLoginTest() {
    	AdminLogin adminlogin =new AdminLogin();
    	adminlogin.setAccountHolder("flash");
    	
    	adminlogin.setAccountBalance(54123);
    	
  
    	 ResponseEntity<AdminLogin> postResponse = restTemplate.postForEntity(getRootUrl() + "/radd",adminlogin, AdminLogin.class);
	        assertNotNull(postResponse);
	        assertNotNull(postResponse.getBody());
    }

}
