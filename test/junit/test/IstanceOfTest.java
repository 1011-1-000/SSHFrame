package junit.test;

import org.junit.Test;
import org.sshframe.core.hibernate.AuditLog.AuditLogable;
import org.sshframe.sample.bean.Department;
import org.sshframe.sample.bean.Person;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-8-28下午4:03:40
 */
public class IstanceOfTest {
	@Test
	public void testInstance(){
		Object s1 = "ddddd";
		System.out.println(s1 instanceof String);
		System.out.println(s1.getClass());
		Object s = new Person("ttt");
		System.out.println(s.toString());
	}
}
