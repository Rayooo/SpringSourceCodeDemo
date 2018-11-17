package com.ray.springsourcecodedemo.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class StudentService {

    private Integer studentNo = ThreadLocalRandom.current().nextInt();


}
