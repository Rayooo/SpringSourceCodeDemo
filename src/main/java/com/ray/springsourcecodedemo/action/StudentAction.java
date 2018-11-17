package com.ray.springsourcecodedemo.action;

import com.ray.springsourcecodedemo.service.ProtoService;
import com.ray.springsourcecodedemo.service.StudentService;
import com.ray.springsourcecodedemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentAction {

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/")
    public String index() {

        TeacherService teacherService = context.getBean(TeacherService.class);

        StudentService studentService = (StudentService) context.getBean("studentService");

        ProtoService protoA = context.getBean(ProtoService.class);

        ProtoService protoB = context.getBean(ProtoService.class);


        return "SUCCESS";
    }

}
