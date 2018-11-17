package com.ray.springsourcecodedemo.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BBean {

    @Autowired
    private CBean cBean;

}
