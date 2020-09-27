package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entity.RemittanceManagement;

@Repository
public interface IRemittanceManagement extends JpaRepository<RemittanceManagement, Long> {

}
