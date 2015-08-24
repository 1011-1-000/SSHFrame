package org.sshframe.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.annotations.Entity;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.sshframe.sample.bean.Person;
import org.sshframe.sample.service.PersonService;

@Transactional
public class PersonServiceImpl implements PersonService{
	
	@Resource private SessionFactory sessionFactory;
	
	@Override
	public void save(Person person) {
		sessionFactory.getCurrentSession().save(person);
	}

	@Override
	public void update(Person person) {
		sessionFactory.getCurrentSession().update(person);
	}

	@Override
	public Person getPerson(Integer id) {
		return (Person) sessionFactory.getCurrentSession().get(Person.class, id);
	}

	@Override
	public void delete(Integer id) {
		sessionFactory.getCurrentSession().delete(
				sessionFactory.getCurrentSession().load(Person.class, id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getPerson() {
		return sessionFactory.getCurrentSession().createQuery("from Person").list();
	}

}
