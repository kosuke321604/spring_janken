package com.example.janken.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.janken.entitity.JankenHouse;


public interface JankenHouseRepository extends JpaRepository<JankenHouse,Integer> {
	

}
