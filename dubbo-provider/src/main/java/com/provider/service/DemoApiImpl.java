package com.provider.service;

import com.api.service.DemoApi;

/**
 * @ClassName :   DemoApiImpl
 * @Description: 接口实现类
 * @Author: mzl
 * @CreateDate: 2022/5/8 1:55
 * @Version: 1.0
 */
public class DemoApiImpl implements DemoApi {

    @Override
    public String sayHello(){
        return "Hello World！";
    }

}
