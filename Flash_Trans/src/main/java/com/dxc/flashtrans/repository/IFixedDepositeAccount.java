package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entity.FixedDepositAccount;

@Repository
public interface IFixedDepositeAccount extends JpaRepository<FixedDepositAccount,Long> {

}
