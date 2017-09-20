package com.unnnn.queue;

import java.io.Serializable;
import java.util.UUID;

/**
 * 队列消息，用户发送和接收消息。
 */
public abstract class QueueMessage implements Serializable {
    /**
     * 队列消息 Id。
     */
    private UUID messageId;
    /**
     * 队列名称。
     */
    private String queueName;
    /**
     * 消息内容。
     */
    private Object message;

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public UUID getMessageId() {
        return messageId;
    }

    public void setMessageId(UUID messageId) {
        this.messageId = messageId;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
