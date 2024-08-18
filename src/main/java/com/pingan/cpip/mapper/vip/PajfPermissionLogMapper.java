package com.pingan.cpip.mapper.vip;
import com.pingan.cpip.entity.vip.PajfCustomerUser;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pingan.cpip.entity.vip.PajfPermissionLog;
import org.apache.ibatis.annotations.Mapper;

/**
* Administrator
* 针对表【pajf_permission_log(客户授权信息日志流水)】的数据库操作Mapper
* 2022-05-09 09:36:46
* generator.com.pingan.cpip.vip.entity.PajfPermissionLog
*/
@Mapper
public interface PajfPermissionLogMapper extends BaseMapper<PajfPermissionLog> {
    int insertSelective(PajfPermissionLog pajfPermissionLog);
}
