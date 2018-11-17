package com.ray.springsourcecodedemo.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class TeacherService {

    private Integer teacherNo = ThreadLocalRandom.current().nextInt();


}
