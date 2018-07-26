package com.event.model;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.event.model.SMTPAuthenticator;
import com.event.model.SendEmail;;


public class SendEmail {
	public String senderEmailID="srecommendation@gmail.com";
	public String senderEmailPassword="recommendation@3";
	final String emailSmtpServer="smtp.gmail.com";
	final String emailSmtpPort="465";
	 String receiverEmailID="Shahsabina64@gmail.com";
	static String emailSubject="Invitation To Event";
	static String emailBody="please! come on this event on ryt time";
	
	
	public SendEmail(String receiverEmailID,String emailSubject,String emailBody) {
		this.receiverEmailID=receiverEmailID;
		this.emailSubject=emailSubject;
		this.emailBody=emailBody;
		Properties properties= new Properties();
		properties.put("mail.smtp.user", senderEmailID);
		properties.put("mail.smtp.host", emailSmtpServer);
		properties.put("mail.smtp.port", emailSmtpPort);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.socketFactory.port",emailSmtpPort);
		properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.socketFactory.fallback","false");
		SecurityManager security=System.getSecurityManager();
		try {
			Authenticator auth= new SMTPAuthenticator();
			Session session=Session.getInstance(properties, auth);
			MimeMessage msg= new MimeMessage(session);
			msg.setText(emailBody);
			msg.setSubject(emailSubject);
			msg.setFrom(new InternetAddress(senderEmailID));
			msg.addRecipient(Message.RecipientType.TO,new InternetAddress(receiverEmailID));
			Transport.send(msg);
			System.out.println("Message Sent");
			
		}catch(Exception exp) {
			System.out.println("Error in Sending Email"+exp);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		SendEmail sendMail=new SendEmail("oceenshah@gmail.com", "INVITATION ", "Come here in time");
		
	}
	
	}


