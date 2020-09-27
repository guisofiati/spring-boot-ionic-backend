package io.github.guisofiati.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import io.github.guisofiati.domain.Cliente;
import io.github.guisofiati.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
