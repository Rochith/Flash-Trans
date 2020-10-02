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

import com.dxc.flashtrans.entites.WithDraw;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =FlashTransApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class WithDrawTest {
	
	@Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    private String getRootUrl() {
        return "http://localhost:" + port;
    }

    @Test
    public void TestCreateWithDrawTest() {
    	WithDraw withdraw =new WithDraw();
    	withdraw.setWithdrawAmount(2222);
    	withdraw.setTransactionPin(4444);
    	 ResponseEntity<WithDraw> postResponse = restTemplate.postForEntity(getRootUrl() + "/wadd",withdraw, WithDraw.class);
	        assertNotNull(postResponse);
	        assertNotNull(postResponse.getBody());
    }


}
