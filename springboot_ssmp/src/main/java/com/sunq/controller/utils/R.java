package com.sunq.controller.utils;


import lombok.Data;


//用于设计表现层返回结果 的模型类，用于前后端进行数据格式统一，
// 也称为前后端数据协议，设计统一的返回值结果类型便于前后端开发读取数据
@Data
public class R {
    private boolean flag;
    private Object data;
    private String msg;

    public R(){};
    public R (Boolean flag){
        this.flag = flag;
    }

    public R (Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    public R(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }
}
