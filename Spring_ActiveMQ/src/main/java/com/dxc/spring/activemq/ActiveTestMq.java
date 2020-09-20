package com.dxc.spring.activemq;

import org.springframework.boot.SpringApplication;

import com.dxc.spring.activemq.consumer.Consumer;
import com.dxc.spring.activemq.producer.Producer;

public class ActiveTestMq {

    public static void main(String[] args) {

	SpringApplication.run(SpringActiveMqApplication.class, args);
	
	Producer producer = new Producer();
	Consumer consumer = new Consumer();

	Thread producerThread = new Thread(producer);
	producerThread.start();

	Thread consumerThread = new Thread(consumer);
	consumerThread.start();
    }
}
