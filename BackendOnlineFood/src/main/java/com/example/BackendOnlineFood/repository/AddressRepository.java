package com.example.BackendOnlineFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BackendOnlineFood.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

