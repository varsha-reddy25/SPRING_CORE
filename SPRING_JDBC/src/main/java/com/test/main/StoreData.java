package com.test.main;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.CustDao;
import com.test.model.Customer;

public class StoreData {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer obj=new Customer();
		obj.setId(3);
		obj.setName("Rana");
		obj.setType("preferred");
		CustDao cst=ctx.getBean("custDao",CustDao.class);
	//	cst.createCustomer(obj);
		//cst.updateCustomer(obj);
		//cst.deleteCustomer(obj);
		//reading the data
		List<Customer> data=cst.getAllCustomers();
		for(Customer cstd:data)
		{
			System.out.println(cstd);
		}
	System.out.println(data);
		
		
	}
}
