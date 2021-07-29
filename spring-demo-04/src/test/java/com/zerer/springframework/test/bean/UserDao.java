package com.zerer.springframework.test.bean;

/**
 * @author zhuangjw
 * @description:
 */
public class UserDao {

    public String queryUserName(String uId) {
        System.out.println(uId);
        return uId;
    }
}
