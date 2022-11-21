package com.sunq.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//作为springmvc的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {

    //拦截所有异常信息
    @ExceptionHandler
    public R doException(Exception e){

        e.printStackTrace();
        return new  R(false,"服务器故障！！联系工作人员");
    }
}
