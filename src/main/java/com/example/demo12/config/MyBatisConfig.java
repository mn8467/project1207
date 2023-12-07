package com.example.demo12.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class MyBatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        // 서버구동시 이 부분 출력
        //log.info("datasource configuration");
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        

        // xml mappers 위치 설정  ex) resources폴더에 /mappers/memberMapper.xml
        Resource[] arrResource = new PathMatchingResourcePatternResolver().getResources("classpath:/mappers/*Mapper.xml");
        sqlSessionFactoryBean.setMapperLocations(arrResource);
        return sqlSessionFactoryBean.getObject();
    }
}
