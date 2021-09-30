package cours.spring.springbootlab.mailer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component -> Singleton

@Component
public class FakeMailSender implements MailSender {
	private static Logger logger = LoggerFactory.getLogger(FakeMailSender.class);
	
	public FakeMailSender() {
		super();
		System.out.println(this.getClass().getSimpleName() + "#constructor");
	}

	@Override
	public void send(String from, String to, String subject, String texte) {
		// trace (0) -> x
		// debug - 
		// info
		// warn
		// error
		logger.error("[NOT envoi d'un email]\nde: {}\nà: {}\nsubjet: {}\ntexte: {}\n", from, to, subject, texte);
	}

	
	
	
	
}
