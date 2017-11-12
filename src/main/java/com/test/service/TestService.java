package com.test.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: x
 * Date: 2017-11-12
 * Time: 11:51
 */
public class TestService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void test(){
        logger.info("姓名：{},年龄：{}","zhangsan","17");
    }
}
