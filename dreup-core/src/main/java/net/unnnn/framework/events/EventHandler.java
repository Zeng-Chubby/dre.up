package net.unnnn.framework.events;

import java.util.ArrayList;

/**
 * 表示实现该接口的类型为事件处理程序。
 *
 * @param <TEvent> 事件类型。
 */
public interface EventHandler<TEvent extends Event> {
    /**
     * 获取当前事件处理程序支持的所能处理的事件列表。
     *
     * @return 事件列表。
     */
    ArrayList<Class> getCanHandledEventClasses();

    /**
     * 判断当前事件处理程序是否支持处理指定的事件类型。
     *
     * @param eventClass 要判断的事件类型。
     * @return 支持指定的事件类型则返回真(True)，否则返回假(False)。
     */
    boolean canHandle(Class eventClass);

    /**
     * 处理给定的事件。
     *
     * @param event 需要处理的事件。
     */
    void handle(TEvent event);
}
