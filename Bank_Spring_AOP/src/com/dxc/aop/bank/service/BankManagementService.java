package com.dxc.aop.bank.service;

import org.springframework.stereotype.Service;

@Service
public class BankManagementService {
    
    public void createAccount() {
	
	System.out.println("Bank account is being created...\n ");
    }
    
    public void checkBalance() {

	System.out.println("Account Balance : INR 27000");
    }

    public void deposit() {

	System.out.println("INR 5000 is credited to your account \n");
    }
    
    public void withdraw() {

	System.out.println("INR 7000 is debited from your account \n");
    }

    public void customerAge(int customerAge) {
	
	System.out.println();
    }

}
