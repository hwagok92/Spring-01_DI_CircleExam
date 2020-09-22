package sample5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Sample5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MessageImpl mi = new MessageImpl("¿µÈñ"); mi.setGreeting("Hello");
		 * 
		 * mi.sayHello();
		 */

		Resource resouce = new ClassPathResource("Msg.xml");
		BeanFactory factory = new XmlBeanFactory(resouce);

		MessageImpl mi = (MessageImpl) factory.getBean("mi");

		mi.sayHello();
	}

}
