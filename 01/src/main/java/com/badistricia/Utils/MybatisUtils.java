package com.badistricia.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author badistricia
 * @version 1.0
 * @description :
 * @date 2022/7/17 15:43:17
 */
public class MybatisUtils {
    public static String resource="mybatis-config.xml";
    public static InputStream inputStream=null;
    public static SqlSessionFactory sqlSessionFactory=null;
    static {
        try {
            inputStream= Resources.getResourceAsStream(resource);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSqlSessionFactory() {
        if(sqlSessionFactory==null) {
            try {
                inputStream=Resources.getResourceAsStream(resource);
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }

}
