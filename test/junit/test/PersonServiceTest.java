package junit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sshframe.sample.bean.Person;
import org.sshframe.sample.service.PersonService;

public class PersonServiceTest {
	private static PersonService personService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try{
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
			personService = (PersonService) ctx.getBean("personService");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Ignore
	public void testSave() {
		personService.save(new Person("测试"));
//		personService.save(new Person("Leo2"));
//		personService.save(new Person("Leo3"));
	}

	@Ignore
	public void testUpdate() {
		Person person = personService.getPerson(1);
		person.setName("Test");
		personService.update(person);
	}

	@Ignore
	public void testGetPersonInteger() {
		Person person = personService.getPerson(1);
		System.out.println(person.getName());
	}

	@Ignore
	public void testDelete() {
		personService.delete(4);
	}

	@Ignore
	public void testGetPerson() {
		List<Person> list = personService.getPersons();
		for(Person p : list){
			System.out.println(p.getName());
		}
	}
	
	@Test
	public void testDir(){
		System.out.println(System.getProperty("user.dir"));
	}
}
