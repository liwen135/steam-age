package com.ca.steam.test.beancopy;

import com.ca.steam.bean.Param;
import com.ca.steam.bean.User;
import com.ca.steam.utils.BeanCopierUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IDEA
 * Author: caian
 * Modify:caian
 * Description
 * Date:2018/4/22
 * Time:22:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
public class TestBeanCopy {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testBeanCopy01() {
        Param param = new Param();
        param.setCreateUser("liming");
        param.setUpdateUser("limsan");
        User user = BeanCopierUtils.copy(param, User.class);
        System.out.println(user);
    }
}
