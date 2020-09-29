package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entites.ReoccuringAccount;

@Repository
public interface IReoccuringAccount extends JpaRepository<ReoccuringAccount, Long> {

}
