package com.newcitysoft.study.mybatis;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/9/18 14:19
 */
@Mapper
public interface BlogMapper {

    Blog selectBlog(int id);
}
