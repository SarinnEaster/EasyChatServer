package com.easychat.support;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Ann
 * date: 2024/08/19.
 * description:
 */
@Data
public abstract class Packet implements Serializable {
    private transient byte version = 1;
    /** 消息时间*/
    protected String dateTime;
    
    public abstract byte getCommand();
}
