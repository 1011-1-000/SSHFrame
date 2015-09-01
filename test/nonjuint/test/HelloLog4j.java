package nonjuint.test;

import org.apache.log4j.Logger;

/**
 * @desciption: Log4J测试
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-8-26下午6:27:31
 */
public class HelloLog4j {
	private static Logger logger = Logger.getLogger(HelloLog4j.class);  
	  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // System.out.println("This is println message.");  
          
        // 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message.");  
    }  
}
