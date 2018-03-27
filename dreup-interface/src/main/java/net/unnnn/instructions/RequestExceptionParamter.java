package net.unnnn.instructions;

/**
 * 表示`请求执行过程中出现的异常`数据传输对象。
 *
 * @author ZengZhi
 * @createdTime 2018-01-17 12:43
 **/
public class RequestExceptionParamter extends DataObject {
    private String exception;
    private String request;

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
