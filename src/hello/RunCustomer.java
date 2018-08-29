package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunCustomer {
	public static void main(String[] args) {
		//  It contains two constructor methods, both accept 3 arguments with different data type.
		//  In addition, if Spring can’t resolve which constructor to use, it will prompt following error message
		//  поэтому в кострукторе в хмл прописали тип
		ApplicationContext context= new ClassPathXmlApplicationContext("customerbean.xml");
		Customer customer= (Customer)context.getBean("CustomerBean");
	}
}
