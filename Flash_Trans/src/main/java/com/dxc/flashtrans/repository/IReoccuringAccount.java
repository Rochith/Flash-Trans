package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.flashtrans.entity.ReoccuringAccount;

public interface IReoccuringAccount extends JpaRepository<ReoccuringAccount, Long> {

}
