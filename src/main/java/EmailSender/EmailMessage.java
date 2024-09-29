package EmailSender;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailMessage {
    private String to;
    private String from;
    private String subject;
    private String messageBody;
    private SMTPConfig smtpConfig;

    public EmailMessage(String to, String from, String subject, String messageBody, SMTPConfig smtpConfig) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.messageBody = messageBody;
        this.smtpConfig = smtpConfig;
    }

    private Session createSession() {
        Properties properties = smtpConfig.getProperties();
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(smtpConfig.getUsername(), smtpConfig.getPassword());
            }
        };
        return Session.getDefaultInstance(properties, authenticator);
    }

    public MimeMessage createMessage(Session session) throws MessagingException {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject(subject);
        message.setText(messageBody);
        return message;
    }

    public void sendEmail() throws MessagingException {
        Session session = createSession();
        MimeMessage message = createMessage(session);
        Transport.send(message);
    }

}