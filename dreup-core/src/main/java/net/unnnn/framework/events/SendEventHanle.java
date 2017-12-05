package net.unnnn.framework.events;

import java.util.ArrayList;

public class SendEventHanle extends EventHandlerBase<EventArgs> {
    protected SendEventHanle(ArrayList<Class> canHandledEventClasses) {
        super(canHandledEventClasses);
    }

    @Override
    public void handle(Event event) {
        if (event instanceof EventArgs) {
            System.out.println("1");
        }
    }
}
