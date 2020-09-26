package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entity.AdminLogin;

@Repository
public interface IAdminLogin extends JpaRepository<AdminLogin, Long> {

}
