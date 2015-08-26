package org.generate.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import org.sshframe.core.orm.GenericManager;
import org.sshframe.sample.bean.Person;
import org.generate.service.PersonService;

@Transactional
public class PersonServiceImpl implements PersonService{
	
	@Resource private GenericManager<Person> genericManager;
	
	@Override
	public void save(Person person) {
		genericManager.save(person);
	}

	@Override
	public void update(Person person) {
		genericManager.update(person);
	}

	@Override
	public Person getPerson(Integer id) {
		return genericManager.getObject(Person.class, id);
	}

	@Override
	public void delete(Integer id) {
		genericManager.delete(Person.class, id);
	}

	@Override
	public List<Person> getPersons() {
		return genericManager.listAll(Person.class);
	}

}
