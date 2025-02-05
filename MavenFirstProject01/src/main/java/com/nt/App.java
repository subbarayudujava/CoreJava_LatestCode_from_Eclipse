package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("com/nt/ConfigMetadata.xml");
    	      Customer bean = (Customer) context.getBean("cus");
    	
        System.out.println( "name:"+bean.getName());
        System.out.println( "name:"+bean.getAddr());
        System.out.println( "name:"+bean.getContract());
        
    }
}
