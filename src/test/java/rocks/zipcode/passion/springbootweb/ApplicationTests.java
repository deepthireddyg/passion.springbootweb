package rocks.zipcode.passion.springbootweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import rocks.zipcode.passion.springbootweb.entities.UserSubmission;
import rocks.zipcode.passion.springbootweb.repos.UserSubmissionRepository;

@SpringBootTest
class ApplicationTests {
	@Autowired
	ApplicationContext context;
	@Test
	public void saveSubmission(){
		UserSubmissionRepository repository = context.getBean(UserSubmissionRepository.class);
		UserSubmission usersub = new UserSubmission();
		usersub.setPersonname("Freddy");
		usersub.setEmailid("freddyk@gmail.com");
		usersub.setServicename("XRay");
		usersub.setPrice(300d);
		usersub.setProvidername(" wilmington Diagnostic Center");
		usersub.setProviderstreet("256 Delaware ave");
		usersub.setProvidercity("Wilmington");
		usersub.setProviderstate("DE");
		usersub.setProviderzipcode("19809");
		usersub.setProviderrating(4);
		repository.save(usersub);

//		repository.findAll().forEach(p->{
//			System.out.println(p);
//		});

		System.out.println(repository.findByServiceName("XRay"));



	}
}
