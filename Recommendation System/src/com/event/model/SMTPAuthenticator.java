package com.event.model;


	import javax.mail.Authenticator;
	import javax.mail.PasswordAuthentication;

	public class SMTPAuthenticator extends Authenticator {
		public String senderEmailID="srecommendation@gmail.com";
		public String senderEmailPassword="recommendation@3";
		public PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(senderEmailID,senderEmailPassword);
			
		}

	}



