package com.example.BackendOnlineFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BackendOnlineFood.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
