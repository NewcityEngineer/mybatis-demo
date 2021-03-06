package com.newcitysoft.study.mybatis;

import java.util.List;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/9/18 14:22
 */
public class Blog {
    private int id;
    private String title;
    private String content;

    private List<Post> posts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", posts=" + posts +
                '}';
    }
}
