package org.sshframe.sample.action;

import java.util.List;

import javax.annotation.Resource;

import org.sshframe.sample.bean.Person;
import org.sshframe.sample.service.PersonService;

public class PersonAction {
	@Resource private PersonService personService;
	private String message;
	private List<Person> persons;
	private Person person;
	private Integer id;

	/*
	 * 列表显示
	 */
	public String list(){
		persons = personService.getPerson();
		return "list";
	}
	
	public String add(){
		personService.save(person);
		message = "添加成功";
		return "message";
	}
	
	public String editForm(){
		person = personService.getPerson(id);
		return "edit";
	}
	
	public String update(){
		personService.update(person);
		message = "更新成功";
		return "message";
	}
	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
