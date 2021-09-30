package cours.spring.springbootlab;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLabApplication {
	
	public static void main(String[] args) {
		
		// Auto configuration
		// - scan le projet (le classpath), pour trouver les @Component
		// - instancier les @Component
		//		- appeler un constructeur
		// - enregistre chaque @Component avec le contexte
		//      - la clé dans est le nom de la classe en lower camel case (SmtpMailSender -> "smtpMailSender")
		System.out.println("1. before run");
		ApplicationContext ctx = SpringApplication.run(SpringBootLabApplication.class, args);
		
		System.out.println("2. after run - before getBean()");
		
		//MailSender sender = ctx.getBean(MailSender.class);
		//sender.send("from@acme.com", "to@acme.com", "Subject", "Texte");
		
		
		SalesReportJob job = ctx.getBean(SalesReportJob.class);
		job.run();
		

		System.out.println("3. after getBean()");
		
		
	}

}
