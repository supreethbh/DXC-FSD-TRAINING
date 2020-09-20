package com.dxc.spring.activemq.consumer;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumer implements Runnable {

    @Override
    public void run() {
        try {
            
            ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");

            Connection connection = factory.createConnection();

            connection.start();

            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination queue = session.createQueue("Queue");

            MessageConsumer consumer = session.createConsumer(queue);

            Message message = consumer.receive(1000);

            if (message instanceof TextMessage) {
                TextMessage textMessage = (TextMessage) message;
                String text = textMessage.getText();
                System.out.println("Consumer Received: " + text);
            }

            session.close();
            connection.close();
       
        } catch (Exception ex) {
            System.err.println("Exception Occured");
        }
    }
}
