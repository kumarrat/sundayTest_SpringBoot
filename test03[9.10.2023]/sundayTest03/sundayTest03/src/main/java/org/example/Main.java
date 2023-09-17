package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class,args);
        System.out.println("Hello SpringBoot");

        String message = "Hello, this message is for security check";
        String subject = "Confirmation";
        String to = "kumarratnesh54545@gmail.com";
        String from = "rockratnsh@gmail.com";

        sendEmail(message,subject,to,from);

    }

    private static void sendEmail(String message, String subject, String to, String from) {

        String host = "smtp.gmail.com";
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES"+properties);

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", true);
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("rockratnsh@gmail.com", "ratnesh54545@");
            }
        });

        session.setDebug(true);

       MimeMessage m = new MimeMessage(session);

       try {

           m.setFrom(from);
           m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
           m.setSubject(subject);
           m.setText(message);

           Transport.send(m);

           System.out.println("sent Sucess...");

       }catch(Exception e){
           e.printStackTrace();
       }
    }
}