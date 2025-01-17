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
public class LogoutResp extends Packet {
    @Override
    public byte getCommand() {
        return Command.LOGOUT_RESP;
    }
}
