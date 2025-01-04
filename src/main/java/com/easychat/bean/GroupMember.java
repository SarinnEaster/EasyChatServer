package com.easychat.bean;

import lombok.Data;

/**
 * @author: Ann
 * date: 2024/12/22.
 * description: 群组成员信息表
 */
@Data
public class GroupMember {
    /** 用户id*/
    private String userId;
    /** */
    private String userName;
    /** */
    private String nickName;
    /** 用户备注*/
    private String remark;
    /** 用户在群里的备注*/
    private String groupRemark;
}
