package cours.spring.springbootlab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cours.spring.springbootlab.mailer.MailSender;

@Component
public class SalesReportJob {
	
	//@Autowired   // getBean("smtpMailSender", MailSender.class)
	//@Qualifier("smtpMailSender")
	private MailSender mailSender;
	private int daysCount;

	
	@Autowired
	public SalesReportJob(@Qualifier("smtpMailSender") MailSender mailSender) {
		super();
		this.mailSender = mailSender;
		this.daysCount = 30;
	}
	
	public SalesReportJob(MailSender mailSender, int daysCount) {
		super();
		this.mailSender = mailSender;
		this.daysCount = daysCount;
	}
	


	public void run() {
		// 1. Obtenir conneion BD
		// 2. Query
		// 3. Traite le résultat
		// 4. Crunch des données

		// 5. Envoi d'un courriel
		this.mailSender.send("reports@acme.com", "gestionnaire@acme.com", "Super rapport", "Un tableau incroyable!");
		
	}
	
}
