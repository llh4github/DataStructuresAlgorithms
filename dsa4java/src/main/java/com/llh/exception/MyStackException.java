package com.llh.exception;

/**
 * MyStackException:自定义栈操作相关的异常
 * <p>
 * CreatedAt: 2020-04-22 23:05
 *
 * @author llh
 */
public class MyStackException extends ProjectException {
    public MyStackException(String err) {
        super(err);
    }
}
