package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entites.BillPayments;

@Repository
public interface IBillPayments extends JpaRepository<BillPayments, Long> {

}
