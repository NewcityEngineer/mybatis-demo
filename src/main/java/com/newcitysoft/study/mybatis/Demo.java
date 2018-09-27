package com.newcitysoft.study.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/9/18 14:07
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

//        SqlSession session = sqlSessionFactory.openSession();
//        try {
//            Blog blog = session.selectOne(
//                    "com.newcitysoft.study.mybatis.BlogMapper.selectBlog", 1);
//            System.out.println(blog);
//        } finally {
//            session.close();
//        }


        SqlSession session = sqlSessionFactory.openSession();
        try {
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            Blog blog = mapper.selectBlog(1);
            System.out.println(blog);
        } finally {
            session.close();
        }
    }
}
