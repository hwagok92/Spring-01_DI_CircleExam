package sample4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import sample3.Circle;
import sample3.Point;

public class Sample4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Calc calc = new CalcImpl(4); calc.setSu1(9);
		 * 
		 * calc.calculate();
		 */
	
		 Resource resource = new ClassPathResource("abab.xml");
			
		 BeanFactory factory = new XmlBeanFactory(resource);
		 CalcImpl ci = (CalcImpl)factory.getBean("calc");
		 ci.calculate();
		 
		 
	}

}
