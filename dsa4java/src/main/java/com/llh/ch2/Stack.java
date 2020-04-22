package com.llh.ch2;

import com.llh.exception.MyStackException;

/**
 * Stack 栈。
 * <p>
 * CreatedAt: 2020-04-22 23:08
 *
 * @author llh
 */
public interface Stack<T> {
    /**
     * 返回栈中元素数目
     *
     * @return 元素数目
     */
    int size();

    /**
     * 栈是否为空
     *
     * @return 栈是否为空
     */
    boolean isEmpty();

    /**
     * 获取栈顶元素。
     *
     * @return 栈顶元素。不会被删除。
     * @throws MyStackException 空栈异常。
     */
    T top() throws MyStackException;

    /**
     * 入栈
     *
     * @param ele 入栈元素
     */
    void push(T ele);

    /**
     * 出栈
     *
     * @return 出栈元素
     * @throws MyStackException 空栈异常。
     */
    T pop() throws MyStackException;

}
