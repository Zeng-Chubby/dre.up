package net.unnnn.framework.common;

/**
 * 工作单元。
 */
public interface UnitOfWork {
    /**
     * 获得一个值，该值表示是否支持分布式事务处理机制。
     *
     * @return 是否支持分布式事务处理机制。
     */
    boolean getDistributedTransactionSupported();

    /**
     * 获得一个值，该值表述了当前事务是否已被提交。
     *
     * @return 是否提交。
     */
    boolean getIsCompleted();

    /**
     * 提交当前事务。
     */
    void commit();

    /**
     * 回滚当前事务。
     */
    void rollback();
}