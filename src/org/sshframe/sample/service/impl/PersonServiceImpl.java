package org.sshframe.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;
import org.sshframe.core.hibernate.dao.GenericDao;
import org.sshframe.sample.bean.Person;
import org.sshframe.sample.service.PersonService;

@Transactional
public class PersonServiceImpl implements PersonService{
	
	@Resource private GenericDao genericManager;
	
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return null;
	}
}
