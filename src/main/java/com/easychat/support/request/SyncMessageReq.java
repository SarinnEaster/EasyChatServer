package com.easychat.support.request;

import com.easychat.support.Command;
import com.easychat.support.Packet;

/**
 * @author Ann
 * date: 2024/10/25.
 * description:
 */
public class SyncMessageReq extends Packet {
    @Override
    public byte getCommand() {
        return Command.SYNC_MESSAGE_REQ;
    }
}
