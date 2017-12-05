package net.unnnn.framework.events;

import java.util.Date;
import java.util.UUID;

public class EventArgs implements Event {
    @Override
    public UUID getId() {
        return null;
    }

    @Override
    public Object getSource() {
        return null;
    }

    @Override
    public Date getTimeStamp() {
        return null;
    }
}
