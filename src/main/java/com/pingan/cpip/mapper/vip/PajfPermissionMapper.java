package com.pingan.cpip.mapper.vip;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pingan.cpip.entity.vip.PajfPermission;

import java.io.Serializable;

/**
* Administrator
* 针对表【pajf_permission(客户授权信息)】的数据库操作Mapper
* 2022-05-09 09:19:34
* generator.com.ping.cpip.vip.entity.PajfPermission
*/
public interface PajfPermissionMapper extends BaseMapper<PajfPermission> {
    int insertSelective(PajfPermission pajfPermission);
}









