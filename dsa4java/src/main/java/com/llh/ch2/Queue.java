package com.llh.ch2;

import com.llh.exception.MyQueueException;

/**
 * Queue
 * <p>
 * CreatedAt: 2020-04-23 21:17
 *
 * @author llh
 */
public interface Queue<T> {

    /**
     * 获取元素数目
     *
     * @return 元素数目
     */
    int size();

    /**
     * 队列是否为空
     *
     * @return 队列是否为空
     */
    boolean isEmpty();

    /**
     * 返回队首元素
     *
     * @return 队首元素（不会被删除）
     * @throws MyQueueException 自定义队列异常
     */
    T front() throws MyQueueException;

    /**
     * 队首元素出队
     *
     * @return 队首元素（会被删除）
     * @throws MyQueueException 自定义队列异常
     */
    T dequeue() throws MyQueueException;

    /**
     * 入队
     *
     * @param ele 元素
     */
    void enqueue(T ele);

    /**
     * 遍历
     */
    void printSelf();

}
