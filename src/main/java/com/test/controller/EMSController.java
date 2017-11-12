package com.test.controller;

import com.test.model.EMSRequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: x
 * Date: 2017-11-12
 * Time: 16:29
 */

@Controller
@RequestMapping("/ems/")
public class EMSController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(method= RequestMethod.POST)
    public @ResponseBody
    String sayHello(@RequestBody EMSRequestBody emsRequestBody) {
        return null;
    }
}
