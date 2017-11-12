package com.test.service;

import hello.HelloWorldController;
import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: x
 * Date: 2017-11-12
 * Time: 11:51
 */
public class TestService extends HelloWorldController {
    @Test
    public void test(){
        logger.info("姓名：{},年龄：{}","zhangsan","17");
    }
}
