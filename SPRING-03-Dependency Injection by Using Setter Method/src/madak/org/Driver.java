package madak.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {
		Resource rsc=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(rsc);
		Famous_Fruits ff=(Famous_Fruits)factory.getBean("fruitbean");
		ff.displayInfo();

	}

}
