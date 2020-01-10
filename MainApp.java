
package hellosprin;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainApp {
   static Log log = LogFactory.getLog(hellosprin.MainApp.class.getName());

   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      log.debug("Going to create HelloWord Obj");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();

      log.info("Exiting the program");
   }
}