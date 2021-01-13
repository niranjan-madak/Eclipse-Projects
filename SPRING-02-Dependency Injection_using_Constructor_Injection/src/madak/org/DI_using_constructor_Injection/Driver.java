package madak.org.DI_using_constructor_Injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {
	
		Resource rsc=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(rsc);
		Student std=(Student)factory.getBean("studentbean");
		std.displayInfo();

	}

}
