package com.experiment.aicommunityback.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;//1 成功  ，  0 失败
    private String msg;//提示信息
    private Object data;//返回的数据


}

