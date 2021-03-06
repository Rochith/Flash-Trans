package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entites.Balance;

@Repository 
public interface IBalance extends JpaRepository<Balance, Long> {

}
