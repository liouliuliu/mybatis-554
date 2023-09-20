package com.lhf.mybatis.session;

/**
 * @Description 工厂模式接口，构建SqlSession的工厂
 * @Date 2023/9/12 15:38
 * @Created by LiuHF
 */
public interface SqlSessionFactory {

    /**
     * 打开一个 session
     * @return SqlSession
     */
    SqlSession openSession();

}
