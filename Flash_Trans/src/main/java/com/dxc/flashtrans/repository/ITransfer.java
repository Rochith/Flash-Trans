package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entites.Transfer;

@Repository 
public interface ITransfer extends JpaRepository<Transfer, Long> {

}
