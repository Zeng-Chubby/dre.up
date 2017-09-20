package net.unnnn.instructions;

/**
 * id 数据传输类型。
 * @param <T> Id 数据类型。
 */
public class IdParamter<T> extends  DataObject {
    private T id;


    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
