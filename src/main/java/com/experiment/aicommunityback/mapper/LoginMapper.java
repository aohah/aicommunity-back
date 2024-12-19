package com.experiment.aicommunityback.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.experiment.aicommunityback.entity.Result;
import com.experiment.aicommunityback.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper extends BaseMapper<User> {
    //    通过name来查数据，返回密码
String selectByName(String name);
}
