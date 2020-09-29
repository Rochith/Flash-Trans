package com.dxc.flashtrans.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entites.SavingsAccount;

@Repository
public interface ISavingsAccount extends JpaRepository<SavingsAccount, Long> {



}
