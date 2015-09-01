package org.sshframe.sample.bean;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.sshframe.core.hibernate.AuditLog.AuditLogable;

/**
 * 如果需要对某个类进行审计，需要做两个事情
 * 1、实现AuditLogable接口
 * 2、在实体类中实现toString()方法
 * @author Leo
 *
 */

@Entity
public class Person implements AuditLogable{
	private Integer id;
	private String name;
//	private Department department;
	
	public Person(){}
	
	public Person(String name) {
		this.name = name;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
