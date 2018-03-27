package com.unnnn.queue;

/**
 * RabbitMQ 队列消息 Bean, 用于发送和接受RabbitMq消息。
 *
 * @author ZengZhi
 */
public class RabbitQueueMessage extends QueueMessage {
    /**
     * 路由 Key。
     */
    private String routingKey;
    /**
     * 交换机分别是 Direct exchange、Fanout exchange、Topic exchange、Headers exchange。
     */
    private RabbitExchangeType exchange;

    /**
     * 路由名称。
     */
    private String exchangeName;

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    public RabbitExchangeType getExchange() {
        return exchange;
    }

    public void setExchange(RabbitExchangeType exchange) {
        this.exchange = exchange;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }
}
