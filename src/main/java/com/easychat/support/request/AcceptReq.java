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
public class AcceptReq extends Packet {
    /** 添加好友邀请方*/
    private String receiver;
    private boolean accept;
    @Override
    public byte getCommand() {
        return Command.ACCEPT_REQ;
    }
}
