package com.cust.exception;

/**
 * @author wangbo
 * @version V1.0
 * @describe:
 * @date 2019/10/22
 */
public class ExceptionTest extends RuntimeException {

    public ExceptionTest() {
        super("用户不存在");
    }
}
