package com.pingan.cpip.mapper.vip;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pingan.cpip.entity.vip.PajfCustomerUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PajfCustomerUserMapper extends BaseMapper<PajfCustomerUser> {

    int insertSelective(PajfCustomerUser pajfCustomerUser);

    int deleteByMemberNo(@Param("memberNo") String memberNo);

    int saveOrUpdate(PajfCustomerUser pajfCustomerUser);
}