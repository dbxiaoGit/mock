package com.test.controller;

import com.test.model.EMSRequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: x
 * Date: 2017-11-12
 * Time: 16:36
 */

@RestController
@RequestMapping("/test")
public class TestXmlController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

/*    public static void main(String[] args) {
        SpringApplication.run(TestXmlController.class, args);
    }*/

    @RequestMapping("login")
    public Map<String, String> login() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("msg", "登录成功");
        return hashMap;
    }

    @RequestMapping(value = "hello")
    public @ResponseBody
    String sayHello(@RequestBody EMSRequestBody emsRequestBody) {
        return "hello,world!";
    }


}
