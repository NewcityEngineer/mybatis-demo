package com.newcitysoft.study.mybatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/9/18 14:19
 */
@Mapper
public interface BlogMapper {

    Blog selectBlog(int id);

    List<Blog> getAll();

    void insert(Blog blog);

    void update(Blog blog);

    void deleteById(Integer id);

    List<Blog> findBlogList(BlogQueryVO vo);
}
