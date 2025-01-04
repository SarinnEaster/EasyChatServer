package com.easychat.mapper;

import com.easychat.bean.AppVersion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Ann
 * date: 2024/12/22.
 */
@Mapper
public interface AppVersionMapper {
    
    AppVersion queryNewVersion(@Param("versionNum") int versionNum, @Param("appType") int appType);

    Integer isForcedUpgrade(@Param("versionNum") int versionNum, @Param("appType") int appType);
}
