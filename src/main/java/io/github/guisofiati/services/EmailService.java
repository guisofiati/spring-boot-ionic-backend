package io.github.guisofiati.services;

import org.springframework.mail.SimpleMailMessage;

import io.github.guisofiati.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
