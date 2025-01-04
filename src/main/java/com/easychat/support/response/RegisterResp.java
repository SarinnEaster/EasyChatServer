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
public class RegisterResp extends Packet {
    private boolean success;

    private String reason;
    
    private String userId;
    private String userName;
    private String token;
    @Override
    public byte getCommand() {
        return Command.REGISTER_RESP;
    }
}
