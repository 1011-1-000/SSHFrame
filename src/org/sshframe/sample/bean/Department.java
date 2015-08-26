package org.sshframe.sample.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
public class Department {
	private Integer id;
	private String departmentName;
	private Person manager;
	
	public Department(){};
	
	public Department(Integer id, String departmentName, Person manager) {
		this.id = id;
		this.departmentName = departmentName;
		this.manager = manager;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@OneToOne()
	@JoinColumn(name = "f_department_id")
	public Person getManager() {
		return manager;
	}
	public void setManager(Person manager) {
		this.manager = manager;
	}
}
