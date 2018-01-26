package com.mjw.controller;

import com.mjw.bean.ReturnModel;

public class BaseRestController {

    protected ReturnModel SUCCESS(Object data){
        return new ReturnModel(0,data,"操作成功");
    }

    protected ReturnModel Faild(Object data){
        return new ReturnModel(1,data,"操作失败");
    }
}
