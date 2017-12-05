package net.unnnn.framework.events;

import java.util.ArrayList;

/**
 * 事件处理基类。
 *
 * @param <IEvent> 事件类型。
 */
public abstract class EventHandlerBase<IEvent extends Event> implements EventHandler {

    private ArrayList<Class> _canHandledEventClasses;

    protected EventHandlerBase(ArrayList<Class> canHandledEventClasses) {
        if (canHandledEventClasses == null || canHandledEventClasses.size() <= 0)
            throw new IllegalArgumentException();

        _canHandledEventClasses = new ArrayList();

        canHandledEventClasses.forEach((p) -> {
            if (p.isAssignableFrom(Event.class))
                throw new IllegalArgumentException();

            _canHandledEventClasses.add(p);
        });
    }

    @Override
    public ArrayList<Class> getCanHandledEventClasses() {
        return _canHandledEventClasses;
    }

    @Override
    public boolean canHandle(Class eventClass) {
        if (eventClass == null)
            throw new IllegalArgumentException();

        return _canHandledEventClasses.contains(eventClass);
    }

        public abstract void handler(Event event);

    @Override
    public void handle(Event event) {
        if (event == null)
            throw new IllegalArgumentException();

        this.handler(event);
    }
}
