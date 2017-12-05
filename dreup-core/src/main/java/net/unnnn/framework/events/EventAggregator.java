package net.unnnn.framework.events;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.function.Consumer;

/**
 * 表示实现该接口的类型为事件聚合器。
 */
public interface EventAggregator<TEvent extends Event> {

    ArrayList<EventHandler> getSubscriptions();

    void publish(TEvent event);

    void publish(TEvent event, Consumer<EventCallbackParamter> callback, Calendar timeout);

    void subscribe(EventHandler handler, Consumer<EventCallbackParamter> callback);

    void subscribe(ArrayList<EventHandler> handlers);

    void subscribe(EventHandler[] handlers);

    void unsubscribe(EventHandler handler);

    void unsubscribe(ArrayList<EventHandler> handlers);

    void unsubscribe(EventHandler[] handlers);

    void unsubscribeAll();
}