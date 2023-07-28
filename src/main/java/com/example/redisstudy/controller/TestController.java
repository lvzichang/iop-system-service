package com.example.redisstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author lvzichang
 * @version 1.0
 * @date 2023/6/25 15:52
 */
@RestController
public class TestController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/test")
    public void test() {
//        String key = "userList";
////        redisTemplate.opsForSet().add(key, "吕子昌", "吕子昌2", "吕子昌3", "吕子昌4");
//        String key2 = "userList2";
//        String key3 = "userList3";
//        Set set = new HashSet();
//        set.add("11");
//        set.add("112");
//        set.add("1123");
//        redisTemplate.opsForZSet().add(key3, "吕子昌", 1);
//        redisTemplate.opsForZSet().add(key3, "吕子昌2", 2);
//        redisTemplate.opsForZSet().add(key3, "吕子昌3", 3);
//        redisTemplate.opsForZSet().add(key3, "吕子昌4", 4);
//        redisTemplate.opsForValue().set("ex", "ex", 1, TimeUnit.MINUTES);
//
//        redisTemplate.opsForList().rightPush(key2, "吕子昌");
//        redisTemplate.opsForList().rightPush(key2, "吕子昌");
//        redisTemplate.opsForList().rightPush(key2, "吕子昌2");
//        redisTemplate.opsForList().

//        redisTemplate.opsForZSet().distinctRandomMembers()

//        Set members = redisTemplate.opsForSet().members(key);
//        System.out.printf("1", members);
    }
}
