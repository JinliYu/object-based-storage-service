package com.jinli.bigdata.core.test;

import com.jinli.bigdata.core.usermgr.IUserService;
import com.jinli.bigdata.core.usermgr.model.SystemRole;
import com.jinli.bigdata.core.usermgr.model.UserInfo;
import com.jinli.bigdata.mybatis.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserServiceTest extends BaseTest {
    @Autowired
    @Qualifier("userServiceImpl")
    IUserService userService;

    @Test
    public void addUserTest(){
        UserInfo userInfo = new UserInfo("Tom","123456","test user", SystemRole.ADMIN);
        userService.addUser(userInfo);
    }

    @Test
    public void getUserTest(){
        UserInfo userInfo = userService.getUserInfoByName("Tom");
        System.out.println(userInfo.getUserName() + "|" + userInfo.getPassword());

    }
}
