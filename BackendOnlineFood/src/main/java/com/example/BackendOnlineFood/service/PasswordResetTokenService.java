package com.example.BackendOnlineFood.service;

import com.example.BackendOnlineFood.model.PasswordResetToken;

public interface PasswordResetTokenService {

	public PasswordResetToken findByToken(String token);

	public void delete(PasswordResetToken resetToken);

}
