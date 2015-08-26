
package org.generate.service;

import java.util.List;
import org.sshframe.sample.bean.Department;

public interface DepartmentService {
	
	/**
	 * 保存
	 * @param Department
	 */
	public void save(Department department);
	
	/**
	 * 更新
	 * @param Department
	 */
	public void update(Department department);
	
	/**
	 * 根据id得到Department对象
	 * @param id
	 * @return
	 */
	public Department getDepartment(Integer id);
	
	/**
	 * 根据id删除Department对象
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * 得到全部Department对象
	 * @return
	 */
	public List<Department> getDepartments();
}
