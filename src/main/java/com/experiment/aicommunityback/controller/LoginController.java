package com.experiment.aicommunityback.controller;

import com.experiment.aicommunityback.entity.Result;
import com.experiment.aicommunityback.entity.User;
import com.experiment.aicommunityback.service.LoginServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    private LoginServe loginServe;

//    将name,password 打包成json文件发给后端localhost:8080/Login/selectByName
//    记得所有的都返回Result
    @PostMapping("/selectByName")
    public Result insertRiskFacilityType(@RequestBody User user) {
            return loginServe.loginByPassword(user);
    }

}
