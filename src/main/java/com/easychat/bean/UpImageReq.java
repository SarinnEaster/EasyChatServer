package com.easychat.bean;

import lombok.Data;

/**
 * @author: Ann
 * date: 2024/12/22.
 * description:
 */
@Data
public class UpImageReq {
    private String picBase64;
    private String suffix;
}
