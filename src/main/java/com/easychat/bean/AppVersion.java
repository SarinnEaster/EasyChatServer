package com.easychat.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Ann
 * date: 2024/12/22.
 * description: 软件版本
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppVersion {
    /** 版本码 */
    private Integer versionCode;
    /** 版本名称 */
    private String versionName;
    /** 版本更新描述 */
    private String versionDesc;
    /** 下载链接 */
    private String downloadUrl;
    /** 是否强制升级 */
    private boolean isForcedUpgrade;
    
    /** 发布时间*/
    private String releaseTime;

}
