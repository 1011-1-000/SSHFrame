package org.generate.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import org.sshframe.core.orm.GenericManager;
import org.sshframe.sample.bean.Department;
import org.generate.service.DepartmentService;

@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	
	@Resource private GenericManager<Department> genericManager;
	
	@Override
	public void save(Department department) {
		genericManager.save(department);
	}

	@Override
	public void update(Department department) {
		genericManager.update(department);
	}

	@Override
	public Department getDepartment(Integer id) {
		return genericManager.getObject(Department.class, id);
	}

	@Override
	public void delete(Integer id) {
		genericManager.delete(Department.class, id);
	}

	@Override
	public List<Department> getDepartments() {
		return genericManager.listAll(Department.class);
	}

}
