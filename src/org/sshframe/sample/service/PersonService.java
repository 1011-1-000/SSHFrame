package org.sshframe.sample.service;

import java.util.List;

import org.sshframe.sample.bean.Person;

public interface PersonService {
	
	/**
	 * 保存
	 * @param person
	 */
	public void save(Person person);
	
	/**
	 * 更新
	 * @param person
	 */
	public void update(Person person);
	
	/**
	 * 根据id得到person对象
	 * @param id
	 * @return
	 */
	public Person getPerson(Integer id);
	
	/**
	 * 根据id删除person对象
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * 得到所有的person对象
	 * @return
	 */
	public List<Person> getPerson();
}
