package com.llh.ch2;

import com.llh.exception.MyQueueException;

/**
 * QueueOnArray 基于数组实现的队列
 * <p>
 * CreatedAt: 2020-04-23 21:38
 *
 * @author llh
 */
public class QueueOnArray<T> implements Queue<T> {
    /**
     * 默认容量
     */
    private static final int CAPACITY = 48;
    /**
     * 实际容量
     */
    private int cap;
    /**
     * 数据区
     */
    private Object[] data;
    /**
     * 队首位置
     */
    private int f = 0;
    /**
     * 队尾位置
     */
    private int r = 0;

    public QueueOnArray() {
        this(CAPACITY);
    }

    public QueueOnArray(int cap) {
        this.cap = cap;
        data = new Object[this.cap];
    }

    @Override
    public int size() {
        return (cap - f + r) % cap;
    }

    @Override
    public boolean isEmpty() {
        return f == r;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T front() throws MyQueueException {
        if (isEmpty()) {
            throw new MyQueueException("队列为空。");
        }
        return (T) data[f];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T dequeue() throws MyQueueException {
        T rs;
        if (isEmpty()) {
            throw new MyQueueException("队列为空。");
        }
        rs = (T) data[f];
        f = (f + 1) % cap;
        return rs;
    }

    @Override
    public void enqueue(T ele) {
        if (size() == cap - 1) {
            throw new MyQueueException("队列已满。");
        }
        data[r] = ele;
        r = (r + 1) % cap;
    }

    @Override
    public void printSelf() {
        for (int i = f; i < r; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
