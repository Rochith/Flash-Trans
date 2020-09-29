package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entites.Registration;

@Repository
public interface IRegistration extends JpaRepository<Registration , Long> {
	
	
	
	

}
