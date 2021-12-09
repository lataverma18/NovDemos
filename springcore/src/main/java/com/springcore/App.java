package com.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.springcore.beans.CollectionBean;
import com.springcore.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //BeanFactory ac=new XmlBeanFactory(new ClassPathResource("spring.xml"));
    	AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	ac.registerShutdownHook();
      Employee emp=ac.getBean("obj1",Employee.class);
      System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getAddress());
      
      /*Employee emp1=ac.getBean("obj1",Employee.class);
      System.out.println(emp1.getEmpId()+"\t"+emp1.getEmpName()+"\t"+emp1.getAddress());
      
      
      emp.greet("Welcome!!!");*/
      
    /*  CollectionBean cb=ac.getBean(CollectionBean.class);
      System.out.println(cb.getAddresses());
      System.out.println(cb.getCset());
      System.out.println(cb.getCmap());
      System.out.println(cb.getCprops());*/
    }
}
