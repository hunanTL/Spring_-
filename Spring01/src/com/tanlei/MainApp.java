package com.tanlei;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2020-05-18 15:25
 */
public class MainApp {

    public static void main(String[] args) {
        //ApplicationContext context=new FileSystemXmlApplicationContext("D:/Spring_workspace/Spring01/src/Beans.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obja= (HelloWorld) context.getBean("helloWorld");
        obja.setMessage("tanlei");
        obja.getMessage();
        HelloWorld objb= (HelloWorld) context.getBean("helloWorld");
        objb.getMessage();

    }
}
