package com.experiment.aicommunityback.service.Impl;

import com.experiment.aicommunityback.entity.Result;
import com.experiment.aicommunityback.entity.User;
import com.experiment.aicommunityback.mapper.LoginMapper;
import com.experiment.aicommunityback.service.LoginServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServeImpl implements LoginServe {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Result loginByPassword(User user) {
        String name = user.getName();
        String password = user.getPassword();
//拿sql查到的密码比对
        String sqlSelectPassword = loginMapper.selectByName(name);
        if (sqlSelectPassword.equals(password)){
            System.out.println(sqlSelectPassword);
            Result result = new Result(0, "登录成功", null);
            return result;
        }
        else {
            System.out.println(sqlSelectPassword);
            Result result = new Result(0, "用户名或密码错误", null);
            return result;
        }

    }
}
