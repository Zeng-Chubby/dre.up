package net.unnnn.framework.events;

/**
 * 事件回调参数。
 */
public class EventCallbackParamter<TEvent extends Event> {
    /**
     * 执行的事件。
     */
    private TEvent event;
    /**
     * 异常信息。
     */
    private Exception exception;
    /**
     * 是否成功。
     */
    private boolean isSuccess;

    public TEvent getEvent() {
        return event;
    }

    public void setEvent(TEvent event) {
        this.event = event;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
