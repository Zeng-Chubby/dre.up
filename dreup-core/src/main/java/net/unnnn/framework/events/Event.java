package net.unnnn.framework.events;

import java.util.Date;
import java.util.UUID;

public interface Event {
    /**
     * 获取事件的唯一标识符。
     *
     * @return Id。
     */
    UUID getId();

    /**
     * 获取产生事件的事件源对象。
     *
     * @return 事件源对象。
     */
    Object getSource();

    /**
     * 获取产生事件的时间戳。
     * 为了支持事件产生时间的一致性，通常事件时间戳都是以 UTC 的方式进行表述。
     * 对于应用系统本身而言，可以根据具体需求将 UTC 时间转换为本地时间。
     *
     * @return 时间戳。
     */
    Date getTimeStamp();
}
