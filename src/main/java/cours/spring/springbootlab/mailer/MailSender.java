package cours.spring.springbootlab.mailer;

public interface MailSender {

	void send(String from, String to, String subject, String texte);

}