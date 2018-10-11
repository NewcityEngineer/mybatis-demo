package com.newcitysoft.study.mybatis;

import java.util.List;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/10/11 9:40
 */
public class BlogQueryVO {
    private String title;
    private List<Integer> ids;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
