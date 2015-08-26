
package org.generate.service;

import java.util.List;
import org.sshframe.sample.bean.Person;

public interface PersonService {
	
	/**
	 * 保存
	 * @param Person
	 */
	public void save(Person person);
	
	/**
	 * 更新
	 * @param Person
	 */
	public void update(Person person);
	
	/**
	 * 根据id得到Person对象
	 * @param id
	 * @return
	 */
	public Person getPerson(Integer id);
	
	/**
	 * 根据id删除Person对象
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * 得到全部Person对象
	 * @return
	 */
	public List<Person> getPersons();
}
