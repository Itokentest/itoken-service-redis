package com.funtl.itoken.service.redis.controller;


import com.funtl.itoken.service.redis.service.RedisService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;

/**
 * <p>Title: RedisController</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/14 11:55
 */
@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "put", method = RequestMethod.POST)
    public String put(String key, String value, long seconds) {
        redisService.put(key, value, seconds);
        return "ok";
    }

    @RequestMapping(value = "get" ,method = RequestMethod.GET)
    public String get(String key) {
        Object o = redisService.get(key);
        if (o != null) {
            String json = String.valueOf(o);
            return json;
        }
        return null;
    }
}
