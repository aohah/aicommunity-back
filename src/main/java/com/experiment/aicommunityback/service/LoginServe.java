package com.experiment.aicommunityback.service;

import com.experiment.aicommunityback.entity.Result;
import com.experiment.aicommunityback.entity.User;

public interface LoginServe {
   Result loginByPassword(User user);
}
