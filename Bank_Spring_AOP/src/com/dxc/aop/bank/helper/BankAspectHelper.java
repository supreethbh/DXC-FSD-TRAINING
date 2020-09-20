package com.dxc.aop.bank.helper;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class BankAspectHelper {

    @Before("execution(public void createAccount())")
    public void createBankAccount() {

	System.out.println("\nProvide following details to create account \n "
		         + "1. Name of applicant as per Aaadhar \n "
		         + "2. Age of applicant \n "
		         + "3. Contact Number \n "
		         + "4. Email ID (valid Email ID) \n "
		         + "5. Aadhaar / Voter Id / Any Govt. proof \n "
		         + "6. Recent Passport size photocopy \n "
		         );
    }

    @After("execution(public void createAccount())")
    public void accountCreated() {

	System.out.println("Bank account created successfully. Welcome to our family Supreeth BH....! \n "
		         + "* User Name      : Supreeth BH \n "
		         + "* User ID        : 140143907 \n "
		         + "* Account Number : 54058010107756 \n "
		         + "* IFSC Code      : HDFC0000240 \n "
		         );
    }

    @AfterReturning("execution(public void withdraw())")
    public void withdrawTransaction() {

	System.out.println("Transaction has been successfully done.....");
    }
    
    @AfterReturning("execution(public void deposit())")
    public void depositTransaction() {

	System.out.println("Transaction has been successfully done.....");
    }
    
    @Around("execution(public void withdraw())")
    public void withdrawEcecuted() {
	
	System.out.println("\nINR 7000 is debited from your account");
	System.out.println("Account Balance After Withdraw : INR 25000 \n");
    }
    
    @Around("execution(public void deposit())")
    public void depositEcecuted() {

	System.out.println("\nINR 5000 is credited to your account");
	System.out.println("Account Balance After Deposit : INR 32000 \n");
    }
    
}
