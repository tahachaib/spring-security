package com.xproce.repository;

import com.xproce.entities.customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface CustomerRepository extends JpaRepository<customer,Long> {
    List<customer> findByEmail(String email);
}
