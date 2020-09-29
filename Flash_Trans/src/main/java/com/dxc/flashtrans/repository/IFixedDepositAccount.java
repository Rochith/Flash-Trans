package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entites.FixedDepositAccount;

@Repository
public interface IFixedDepositAccount extends JpaRepository<FixedDepositAccount,Long> {

}
