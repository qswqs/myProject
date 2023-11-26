package com.atguigu.service;

import com.atguigu.pojo.User;
import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author woliw
* @description 针对表【news_user】的数据库操作Service
* @createDate 2023-09-26 18:25:20
*/
public interface UserService extends IService<User> {
    //登录业务
    Result login(User user);
    //token获取用户数据
    Result getUserInfo(String token);
    //检查账号是否可用
    Result checkUserName(String username);
    //注册业务
    Result regist(User user);
}
