package com.easychat.support.request;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

/**
 * @author Ann
 * date: 2024/08/19.
 * description:
 */
@Data
public class UpdatePasswdReq extends Packet {
    /** 旧密码*/
    private String oldPassword;
    /** 新密码*/
    private String newPassword;
    @Override
    public byte getCommand() {
        return Command.UPDATE_PASSWD_REQ;
    }
}
