package EmailSender;

import EmailSender.SMTPConfig;
import EmailSender.EmailMessage;
import javax.mail.MessagingException;

public class Main {
    public static void main(String[] args) throws MessagingException {
        SMTPConfig smtpConfig = new SMTPConfig("smtp.gmail.com",
                587,
                "azaliamuratova628@gmail.com",
                "");
        EmailMessage emailMessage = new EmailMessage("indonesianwesleysnipes@gmail.com",
                "azaliamuratova628@gmail.com",
                "test subject",
                "hello from me!",
                smtpConfig);
        emailMessage.sendEmail();
    }

}