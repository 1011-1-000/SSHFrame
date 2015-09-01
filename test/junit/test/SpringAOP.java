package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sshframe.core.hibernate.dao.GenericDao;
import org.sshframe.sample.bean.Department;
import org.sshframe.sample.bean.Person;
import org.sshframe.sample.service.PersonService;

public class SpringAOP {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		GenericDao personService = (GenericDao)ctx.getBean("genericDao");
//		personService.updateByHql(Person.class, "update Person set name = 'hi' where id = 1");
//		Person p = personService.find(Person.class, 1);
//		Department d = new Department(1, "imya", p);
//		personService.save(Department.class, d);
		personService.delete(Person.class, 2);
//		personService.save(Person.class,p);
	}

}
