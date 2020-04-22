package com.llh.ch2;

import com.llh.exception.MyStackException;

/**
 * StackOnArray 基于数组实现的栈结构。
 * <p>
 * CreatedAt: 2020-04-22 23:14
 *
 * @author llh
 */
public class StackOnArray<T> implements Stack<T> {
    /**
     * 数组默认容量。
     */
    private static final int CAPACITY = 256;
    /**
     * 数组实际容量。
     */
    protected int cap;
    /**
     * 数据区。
     */
    protected Object[] data;
    /**
     * 栈顶元素的位置。
     */
    protected int top = -1;

    public StackOnArray() {
        this(CAPACITY);
    }

    public StackOnArray(int cap) {
        this.cap = cap;
        data = new Object[cap];
    }

    @Override
    public int size() {
        return top + 1;
    }


    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T top() throws MyStackException {
        if (isEmpty())
            throw new MyStackException("栈为空！");
        return (T) data[top];
    }

    @Override
    public void push(T ele) {
        if (size() == cap)
            throw new MyStackException("栈已满！");
        data[++top] = ele;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() throws MyStackException {
        if (isEmpty())
            throw new MyStackException("栈为空！");
        T ele = (T) data[top];
        data[top--] = null;
        return ele;
    }
}
