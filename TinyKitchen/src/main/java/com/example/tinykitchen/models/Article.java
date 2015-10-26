package com.example.tinykitchen.models;

/**
 * Created by vortana_say on 26/10/15.
 */
public class Article {

    String id;
    String author;
    String title;
    String body;
    String thumb;
    String photo;
    String published_date;
    String article_references;

    public Article(String id, String author, String title, String body, String thumb, String photo, String published_date, String article_references){
        this.id = id;
        this.author = author;
        this.title = title;
        this.body = body;
        this.thumb = thumb;
        this.photo = photo;
        this.published_date = published_date;
        this.article_references = article_references;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getArticle_references() {
        return article_references;
    }

    public void setArticle_references(String article_references) {
        this.article_references = article_references;
    }
}
