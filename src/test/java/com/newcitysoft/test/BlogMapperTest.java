package com.newcitysoft.test;

import com.newcitysoft.study.mybatis.Blog;
import com.newcitysoft.study.mybatis.BlogMapper;
import com.newcitysoft.study.mybatis.BlogQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/9/29 10:57
 */
public class BlogMapperTest {

    private SqlSession sqlSession;

    @Before
    public void doBefore() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testGetAll() {
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            List<Blog> blogList = mapper.getAll();
            System.out.println(blogList);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelect() {
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Blog blog = mapper.selectBlog(4);
            System.out.println(blog);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testInsert() {
        Blog blog = new Blog();

        blog.setTitle("标题一");
        blog.setContent("内容...");
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            mapper.insert(blog);

            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void testUpdate() {
        Blog blog = new Blog();

        blog.setId(4);
        blog.setTitle("标题一");
        blog.setContent("啊实打实大安全去请问恶趣味 其味无穷二无群二群翁群");
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            mapper.update(blog);

            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testDelete() {
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            mapper.deleteById(2);

            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testFindBlogList() {
        try {
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

            BlogQueryVO vo = new BlogQueryVO();

            vo.setIds(Arrays.asList(1,4,5));

            List<Blog> blogList = mapper.findBlogList(vo);
            System.out.println(blogList);
        } finally {
            sqlSession.close();
        }
    }
}
