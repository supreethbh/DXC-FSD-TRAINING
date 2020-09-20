package com.dxc.aop.bank.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.dxc.aop.bank.service",
				"com.dxc.aop.bank.helper",})
public class BankApplicationConfiguration {
	
}
