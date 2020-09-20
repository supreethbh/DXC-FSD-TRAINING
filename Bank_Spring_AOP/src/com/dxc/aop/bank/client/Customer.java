package com.dxc.aop.bank.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dxc.aop.bank.configuration.BankApplicationConfiguration;
import com.dxc.aop.bank.service.BankManagementService;

public class Customer {

    public static void main(String[] args) {

	@SuppressWarnings("resource")
	ApplicationContext context = new AnnotationConfigApplicationContext(BankApplicationConfiguration.class);

	BankManagementService service = context.getBean(BankManagementService.class);
	
	service.createAccount();
	
	service.checkBalance();

	service.deposit();
	
	service.withdraw();
	
    }

}
