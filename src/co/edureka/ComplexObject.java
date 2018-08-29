package co.edureka;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexObject {
	Properties adminEmails;
	List someList;
	Map someMap;
	Set someSet;

	public void setSomeList(LinkedList<String> someList) {
		this.someList = someList;
	}

	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}
}

class Maiinhdfj{
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("complexObject.xml");
		ComplexObject complexObjec= (ComplexObject) applicationContext.getBean("complexObject");
		System.out.println(complexObjec.someList);
		System.out.println(complexObjec.someSet);
	}
}
