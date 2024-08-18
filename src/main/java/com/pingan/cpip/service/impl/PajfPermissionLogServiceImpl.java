package com.pingan.cpip.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pingan.cpip.entity.vip.PajfPermissionLog;
import com.pingan.cpip.mapper.vip.PajfPermissionLogMapper;
import com.pingan.cpip.service.PajfPermissionLogService;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【pajf_permission_log(客户授权信息日志流水)】的数据库操作Service实现
* @createDate 2022-05-09 09:36:46
*/
@Service
public class PajfPermissionLogServiceImpl extends ServiceImpl<PajfPermissionLogMapper, PajfPermissionLog> implements PajfPermissionLogService {
}
