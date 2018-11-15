package com.funtl.itoken.service.redis.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>Title: RedisService</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/14 11:50
 */
public interface RedisService {

    /**
     *
     * @param key
     * @param value
     * @param seconds 超时时间
     */
    public void put(String key, Object value, long seconds);

    public Object get(String key);
}
