package cours.spring.springbootlab.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cours.spring.springbootlab.SalesReportJob;
import cours.spring.springbootlab.mailer.MailSender;

@Configuration
public class MailConfig {
	
	@Bean
	public SalesReportJob dailySalesReportJob(@Qualifier("smtpMailSender") MailSender mailSender) {
		return new SalesReportJob(mailSender, 7);
	}

}
