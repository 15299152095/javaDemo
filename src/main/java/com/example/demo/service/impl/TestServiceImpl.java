package com.example.demo.service.impl;

import com.example.demo.service.TestService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public Object test(String name) {
        HashSet sets = new HashSet();
        HashMap map = new HashMap();
        for(int i=0; i<5; i++){
            sets.add(i*2);
        }
        map.put("name", name);
        map.put("age", 10);
        map.put("list", sets);
        return map;
    }
}
