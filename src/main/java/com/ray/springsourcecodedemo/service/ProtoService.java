package com.ray.springsourcecodedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtoService {

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    private Integer protoNo = ThreadLocalRandom.current().nextInt();


}
