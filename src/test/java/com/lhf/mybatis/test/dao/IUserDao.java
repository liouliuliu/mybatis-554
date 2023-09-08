package com.lhf.mybatis.test.dao;

/**
 * @Description
 * @Date 2023/9/8 16:08
 * @Created by LiuHF
 */
public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);

}