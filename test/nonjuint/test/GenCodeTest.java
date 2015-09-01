package nonjuint.test;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sshframe.core.codegen.CodeUtil;


public class GenCodeTest {
	
	@Test
	public void test() {
		new CodeUtil().genCode("org/sshframe/sample/bean");
	}

}
