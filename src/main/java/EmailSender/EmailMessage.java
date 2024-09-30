package EmailSender;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.IOException;
import java.util.Properties;


public class EmailMessage {
    private String to;
    private String from;
    private String subject;
    private String messageBody;
    private SMTPConfig smtpConfig;
    private String attachmentPath;

    public EmailMessage(String to, String from, String subject, String messageBody, SMTPConfig smtpConfig, String attachmentPath){
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.messageBody = messageBody;
        this.smtpConfig = smtpConfig;
        this.attachmentPath = attachmentPath;
    }

    public EmailMessage(String to, String from, String subject, String messageBody, SMTPConfig smtpConfig) {
        this(to, from, subject, messageBody, smtpConfig, null);

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

    public MimeMessage createMessage(Session session) throws MessagingException, IOException {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject(subject);

        MimeBodyPart textPart = new MimeBodyPart();
        textPart.setText(messageBody, "utf-8", "plain");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(textPart);

        if (attachmentPath != null && !attachmentPath.isEmpty()) {
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(new File(attachmentPath));
            multipart.addBodyPart(attachmentPart);
        }

        message.setContent(multipart);
        return message;
    }

    public void sendEmail() throws MessagingException, IOException {
        Session session = createSession();
        MimeMessage message = createMessage(session);
        Transport.send(message);
    }

}