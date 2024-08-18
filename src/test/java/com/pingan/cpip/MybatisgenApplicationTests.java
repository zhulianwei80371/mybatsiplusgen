package com.pingan.cpip;

import com.pingan.cpip.entity.vip.PajfCustomerUser;
import com.pingan.cpip.mapper.vip.PajfCustomerUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisgenApplicationTests {

    @Autowired
    private PajfCustomerUserMapper pajfCustomerUserMapper;
    @Test
    void contextLoads() {
    }
    @Test
    public void test1(){
        PajfCustomerUser user =new PajfCustomerUser();
        user.setMemberNo("a9001");
        user.setUserNo("a9001");
        pajfCustomerUserMapper.insert(user);
        user.setMemberNo("a9002");
        user.setUserNo("a9002");
        pajfCustomerUserMapper.insert(user);
        pajfCustomerUserMapper.deleteByMemberNo("a1010");
    }

    @Test
    public void test2(){
        PajfCustomerUser user =new PajfCustomerUser();
        user.setMemberNo("a90010000");
        user.setUserNo("a900100000");
        pajfCustomerUserMapper.saveOrUpdate(user);
    }

}
