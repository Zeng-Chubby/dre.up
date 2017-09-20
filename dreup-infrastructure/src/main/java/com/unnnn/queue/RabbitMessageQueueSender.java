package com.unnnn.queue;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Rabbit 消息队列发送。
 */
@Component
public class RabbitMessageQueueSender implements MessageQueueSender {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private RabbitDirectExchangeHandler rabbitDirectExchangeHandler;

    @Autowired
    private CachingConnectionFactory connectionFactory;

    @Autowired
    private AmqpAdmin amqpAdmin;

    @Override
    public void send(QueueMessage message) {
        if (message == null)
            throw new IllegalArgumentException("message 不能为空");

        if (!(message instanceof RabbitQueueMessage))
            throw new IllegalArgumentException("message 必须要是 RabbitQueueMessage 实例。");

        // 转换成 Rabbit 队列消息。
        RabbitQueueMessage rabbitMessageMq = (RabbitQueueMessage) message;
        //CachingConnectionFactory
        switch (rabbitMessageMq.getExchange()) {
            case Direct:
                this.template.convertAndSend(message.getQueueName(), message.getMessage());
                break;
            case Fanout:
                // 创建一个群发交换机。
                /*FanoutExchange fanoutExchange = new FanoutExchange("fanoutExchange_test");
                //FanoutExchange fanoutExchange1 = new FanoutExchange("cccccccc1");

                Queue q1 = new Queue("a1.aa");
                Queue q2 = new Queue("a1.bbb");
                Queue q3 = new Queue("a1.cccc");
                Queue q4 = new Queue("a1.ddddd.dddddd");
                Queue q5 = new Queue("a1.eeeeee.eeeeeee");
                Queue q6 = new Queue("a1.fffffff.ffffffff.hodoop.tomcat");

                Queue a1 = new Queue("a2.aa");
                Queue a2 = new Queue("a2.bbb");
                Queue a3 = new Queue("a2.cccc");
                Queue a4 = new Queue("a2.ddddd");
                Queue a5 = new Queue("a2.eeeeee");
                Queue a6 = new Queue("a2.fffffff");

                amqpAdmin.declareQueue(q1);
                amqpAdmin.declareQueue(q2);
                amqpAdmin.declareQueue(q3);
                amqpAdmin.declareQueue(q4);
                amqpAdmin.declareQueue(q5);
                amqpAdmin.declareQueue(q6);

                *//*amqpAdmin.declareQueue(a1);
                amqpAdmin.declareQueue(a2);
                amqpAdmin.declareQueue(a3);
                amqpAdmin.declareQueue(a4);
                amqpAdmin.declareQueue(a5);
                amqpAdmin.declareQueue(a6);*//*

                // 交换机绑定队列。
                Binding bq1 = BindingBuilder.bind(q1).to(fanoutExchange);
                Binding bq2 = BindingBuilder.bind(q2).to(fanoutExchange);
                Binding bq3 = BindingBuilder.bind(q3).to(fanoutExchange);
                Binding bq4 = BindingBuilder.bind(q4).to(fanoutExchange);
                Binding bq5 = BindingBuilder.bind(q5).to(fanoutExchange);
                Binding bq6 = BindingBuilder.bind(q6).to(fanoutExchange);

                *//*Binding ba1 = BindingBuilder.bind(a1).to(fanoutExchange);
                Binding ba2 = BindingBuilder.bind(a2).to(fanoutExchange);
                Binding ba3 = BindingBuilder.bind(a3).to(fanoutExchange);
                Binding ba4 = BindingBuilder.bind(a4).to(fanoutExchange);
                Binding ba5 = BindingBuilder.bind(a5).to(fanoutExchange);
                Binding ba6 = BindingBuilder.bind(a6).to(fanoutExchange);*//*

                amqpAdmin.declareExchange(fanoutExchange);

                amqpAdmin.declareBinding(bq1);
                amqpAdmin.declareBinding(bq2);
                amqpAdmin.declareBinding(bq3);
                amqpAdmin.declareBinding(bq4);
                amqpAdmin.declareBinding(bq5);
                amqpAdmin.declareBinding(bq6);*/

                /*amqpAdmin.declareBinding(ba1);
                amqpAdmin.declareBinding(ba2);
                amqpAdmin.declareBinding(ba3);
                amqpAdmin.declareBinding(ba4);
                amqpAdmin.declareBinding(ba5);
                amqpAdmin.declareBinding(ba6);*/

                /*amqpAdmin.declareExchange(fanoutExchange1);
                Binding b2 = BindingBuilder.bind(fanoutExchange1).to(fanoutExchange);
                amqpAdmin.declareBinding(b2);*/



                this.template.convertAndSend("fanoutExchange_test", rabbitMessageMq.getRoutingKey(), rabbitMessageMq.getMessage());
                break;
            case Topic:
            case Headers:
                throw new NotImplementedException();
            default:
                throw new IllegalArgumentException("message 不能为空");
        }
    }
}
