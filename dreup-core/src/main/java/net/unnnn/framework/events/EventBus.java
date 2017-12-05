package net.unnnn.framework.events;

import net.unnnn.framework.common.UnitOfWork;

import java.util.ArrayList;
import java.util.UUID;

/**
 * 表示事件总线。
 *
 * @param <TEvent> 事件类型。
 */
public interface EventBus<TEvent extends Event> extends UnitOfWork {
    /**
     * 获取事件的唯一标识符。
     *
     * @return Id。
     */
    UUID getId();

    /**
     * 发布指定的事件。
     *
     * @param event 需要发布的事件实例。
     */
    void publish(TEvent event);

    /**
     * 发布指定的事件集合。
     *
     * @param events 需要发布的消息实例集合。
     */
    void publish(ArrayList<TEvent> events);

    /**
     * 清除等待提交的事件。
     */
    void clear();
}
