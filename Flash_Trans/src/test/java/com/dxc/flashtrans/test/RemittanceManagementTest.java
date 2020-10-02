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
import com.dxc.flashtrans.entites.RemittanceManagement;


@RunWith(SpringRunner.class)
@SpringBootTest(classes =FlashTransApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)


public class RemittanceManagementTest {
	
	@Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    private String getRootUrl() {
        return "http://localhost:" + port;
    }

    @Test
    public void TestCreateRemittanceManagementTest() {
    	RemittanceManagement rmanagement =new RemittanceManagement();
    	rmanagement.setRmName("flash");
    	rmanagement.setEmail("flash@gmail.com");
    	rmanagement.setCardName("flash");
    	rmanagement.setExpDate("01/02/23");
    	rmanagement.setCardNo(44447777);
    	rmanagement.setCvv(123);
    	
  
    	 ResponseEntity<RemittanceManagement> postResponse = restTemplate.postForEntity(getRootUrl() + "/radd",rmanagement, RemittanceManagement.class);
	        assertNotNull(postResponse);
	        assertNotNull(postResponse.getBody());
    }
	
	
	
	
	
	
	
	

}
