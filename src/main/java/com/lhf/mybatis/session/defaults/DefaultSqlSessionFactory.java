package com.lhf.mybatis.session.defaults;

import com.lhf.mybatis.binding.MapperRegistry;
import com.lhf.mybatis.session.SqlSession;
import com.lhf.mybatis.session.SqlSessionFactory;

/**
 * @Description 默认的 DefaultSqlSessionFactory
 * @Date 2023/9/12 15:38
 * @Created by LiuHF
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry  mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry){
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
}
