package com.unnnn.queue;

/**
 * 消息队列接收接口,所有的消息队列接收消息都必须实现该接口。
 */
public interface MessageQueueReceive {
    /**
     * 发送消息。
     * @param message 队列消息。
     */
    void receive(QueueMessage message);
}
