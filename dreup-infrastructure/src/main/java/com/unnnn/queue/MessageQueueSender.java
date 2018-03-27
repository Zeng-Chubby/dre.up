package com.unnnn.queue;

/**
 * 消息队列发送接口,所有的消息队列发送消息都必须实现该接口。
 */
public interface MessageQueueSender {
    /**
     * 接收消息。
     *
     * @param message 队列消息。
     */
    void send(QueueMessage message);
}
