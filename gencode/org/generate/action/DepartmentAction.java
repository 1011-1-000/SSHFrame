package org.generate.action;

import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.sshframe.sample.bean.Department;
import org.generate.service.DepartmentService;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("struts-default")
@Namespace("/department")
@Results({  
	  @Result(name="list",location="departmentlist.jsp"),
	  @Result(name="edit",location="editdepartment.jsp"),
	  @Result(name="message",location="message.jsp")
	}) 
public class DepartmentAction extends ActionSupport{
	private DepartmentService departmentService;
	private String message;
	private List<Department> departments;
	private Department department;
	private Integer id;

	/*
	 * 列表显示
	 */
	@Action("list")
	public String list(){
		departments = departmentService.getDepartments();
		return "list";
	}
	@Action("add")
	public String add(){
		departmentService.save(department);
		message = "添加成功";
		return "message";
	}
	@Action("editForm")
	public String editForm(){
		department = departmentService.getDepartment(id);
		return "edit";
	}
	@Action("update")
	public String update(){
		departmentService.update(department);
		message = "更新成功";
		return "message";
	}
	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
}
