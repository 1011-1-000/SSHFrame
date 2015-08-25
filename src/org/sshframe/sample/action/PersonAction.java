package org.sshframe.sample.action;

import java.util.List;


import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.sshframe.sample.bean.Person;
import org.sshframe.sample.service.PersonService;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("struts-default")
@Namespace("/person")
@Results({  
	  @Result(name="list",location="personlist.jsp"),
	  @Result(name="edit",location="editperson.jsp"),
	  @Result(name="message",location="message.jsp"),
	  @Result(name="success",location="personlist.jsp")
	}) 
public class PersonAction extends ActionSupport{
	private static final long serialVersionUID = 8610899113274184210L;
	private PersonService personService;
	private String message;
	private List<Person> persons;
	private Person person;
	private Integer id;

	/*
	 * 列表显示
	 */
	@Action("list")
	public String list(){
		persons = personService.getPerson();
		return "list";
	}
	@Action("add")
	public String add(){
		personService.save(person);
		message = "添加成功";
		return "message";
	}
	@Action("editForm")
	public String editForm(){
		person = personService.getPerson(id);
		return "edit";
	}
	@Action("update")
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
	
	public PersonService getPersonService() {
		return personService;
	}
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}
