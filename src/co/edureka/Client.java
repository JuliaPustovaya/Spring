package co.edureka;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
		//Object Construction
		/*Employee eRef= new Employee();
		eRef.setEid(101);
		eRef.setEnamne("Fedya");
		eRef.setEadress("Belgorod 22");
		System.out.println(eRef);*/

		//Spring way
	/*	Resource resource= new ClassPathResource("employeebean.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		Employee e1 = (Employee) factory.getBean("emp1");
		Employee e2 = factory.getBean("emp2",Employee.class);
		System.out.println(" "+e1);
		System.out.println(" "+e2);    */
		ApplicationContext context= new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1=(Employee)context.getBean("hash");
		System.out.println(e1);
		e1.setEnamne("dkfjd");
		GenericApplicationContext context1= new GenericApplicationContext();
		new XmlBeanDefinitionReader(context1).loadBeanDefinitions("employeebean.xml");
		context1.refresh();
		Employee e2= (Employee) context1.getBean("emp2");
		System.out.println("hjd" + e2);
	    HashMap<Integer,String> st= new HashMap<>();
	    st.put(1,"fe");
	    st.put(2,"kfe");
		st.put(1, "9");
		Integer istInt = new Integer(1);
		          Integer secondInt = new Integer(1);

		         if (istInt.compareTo( secondInt)==0) {
			           System.out.println("both one are equal");

			         } else {
			            System.out.println("Both one are not equal");
			          }

		for (Map.Entry<Integer,String> p:st.entrySet()) {
			System.out.println(p.getKey() +p.getValue());

		}

		int a=10;
		int b=10;
		System.out.println(a);

		
	}

}
