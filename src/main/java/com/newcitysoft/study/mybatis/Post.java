package com.newcitysoft.study.mybatis;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/9/29 17:40
 */
public class Post {
    private int id;
    private int blogId;
    private String title;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
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

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", blogId=" + blogId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
