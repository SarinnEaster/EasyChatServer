package com.easychat.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * @author: Ann
 * date: 2024/12/22.
 * description: 用户
 */
@Data
public class User {
    private String userId;
    private String userName;
    @JsonIgnore
    private String password;
    private String nickName;
    private String avatar;
    private String signature;
    private String remark;
}
