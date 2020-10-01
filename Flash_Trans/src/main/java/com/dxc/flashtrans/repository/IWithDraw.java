package com.dxc.flashtrans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.flashtrans.entites.WithDraw;

@Repository
public interface IWithDraw extends JpaRepository<WithDraw, Long> {

}
