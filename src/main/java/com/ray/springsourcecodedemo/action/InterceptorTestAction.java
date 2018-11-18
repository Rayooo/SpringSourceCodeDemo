package com.ray.springsourcecodedemo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/i")
public class InterceptorTestAction {

    @RequestMapping("success")
    public String getSuccess() {
        return "success";
    }

    @RequestMapping("error")
    public String getError() throws Exception {
        throw new Exception("遇到错误了");
    }

    @ExceptionHandler
    public String exceptionHandler(Exception e){
        System.out.println("遇到错误，异常处理");
        return "Encountered error";
    }


}
