package junit.test;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sshframe.core.codegen.CodeUtil;


public class GenCodeTest {
	
	private static CodeUtil codeUtil;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try{
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
			codeUtil = (CodeUtil) ctx.getBean("codeUtil");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void test() {
		codeUtil.genCode("org/sshframe/sample/bean");
	}

}
