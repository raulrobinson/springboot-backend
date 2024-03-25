package com.rasysbox.ws.repository;

import com.rasysbox.ws.entity.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterEntity, Integer> {
    RegisterEntity findFirstByOrderByFechaDesc();

    @Query("SELECT t FROM RegisterEntity t ORDER BY t.fecha DESC LIMIT 10")
    List<RegisterEntity> findLastTenRegisters();

}
