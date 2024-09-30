package EmailSender;
import javax.mail.MessagingException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws MessagingException, IOException {
        SMTPConfig smtpConfig = new SMTPConfig("smtp.gmail.com",
                "587",
                "azaliamuratova628@gmail.com",
                System.getenv("my_pass"));
        EmailMessage emailMessage = new EmailMessage("indonesianwesleysnipes@gmail.com",
                "azaliamuratova628@gmail.com",
                "test subject",
                "hello from birds!!!",
                smtpConfig,
                "/Users/azaliya02/Desktop/crazyAssSteven.jpg");
        emailMessage.sendEmail();
    }

}