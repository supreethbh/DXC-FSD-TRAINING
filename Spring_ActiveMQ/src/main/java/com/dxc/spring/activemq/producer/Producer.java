package com.dxc.spring.activemq.producer;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Producer implements Runnable {

    public void run() {
        try { 
       
            ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");

            Connection connection = factory.createConnection();

            connection.start();

            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination queue = session.createQueue("Queue");

            MessageProducer producer = session.createProducer(queue);

            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            String msg = "Hello World....!";

            TextMessage message = session.createTextMessage(msg);
            System.out.println("\nProducer Sent: " + msg);
            producer.send(message);

            session.close();
            connection.close();
        
        } catch (Exception ex) {
            System.err.println("Exception Occured");
        }

    }
}
