package com.lhf.mybatis.test;

import com.lhf.mybatis.binding.MapperProxyFactory;
import com.lhf.mybatis.binding.MapperRegistry;
import com.lhf.mybatis.session.SqlSession;
import com.lhf.mybatis.session.SqlSessionFactory;
import com.lhf.mybatis.session.defaults.DefaultSqlSessionFactory;
import com.lhf.mybatis.test.dao.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Date 2023/9/8 15:31
 * @Created by LiuHF
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_MapperProxyFactory() {
        // 1. 注册 Mapper
        MapperRegistry registry = new MapperRegistry();
        registry.addMappers("com.lhf.mybatis.test.dao");

        // 2. 从 SqlSession 工厂获取 Session
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(registry);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 4. 测试验证
        String res = userDao.queryUserName("10001");
        logger.info("测试结果：{}", res);
    }
}
