package com.easychat.support.response;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

/**
 * @author Ann
 * date: 2024/08/19.
 * description:
 */
@Data
public class MessageSelfResp extends Packet {
    private String receiverId;
    private String groupId;
    private boolean success;
    private String reason;
    @Override
    public byte getCommand() {
        return Command.MESSAGE_SELF_RESP;
    }
}
