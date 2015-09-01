package junit.test;


import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sshframe.core.hibernate.AuditLog.AuditLogable;
import org.sshframe.core.hibernate.dao.GenericDao;
import org.sshframe.sample.bean.Department;
import org.sshframe.sample.bean.Person;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-8-26下午7:45:57
 */
public class DaoTest {

	private static GenericDao genericDao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try{
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
			genericDao = (GenericDao) ctx.getBean("genericDao");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void updateTest(){
//		genericDao.updateByHql("update Person t set t.department = 2");
//		genericDao.updateBySql("update t_person t set t.f_department_id = 1");
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("name", "leo");
		genericDao.updateAllByMap(Person.class, map);
	}
}
