package com.example.news.model;

import java.io.Serializable;
import java.util.Objects;

public class Article implements Serializable {
    public String author;
    public String content;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return Objects.equals(author, article.author) &&
                Objects.equals(content, article.content) &&
                Objects.equals(description, article.description) &&
                Objects.equals(publishedAt, article.publishedAt) &&
                Objects.equals(title, article.title) &&
                Objects.equals(url, article.url) &&
                Objects.equals(urlToImage, article.urlToImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, content, description, publishedAt, title, url, urlToImage);
    }

    public String description;
    public String publishedAt;
    public String title;
    public String url;
    public String urlToImage;

    @Override
    public String toString() {
        return "Article{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", description='" + description + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", urlToImage='" + urlToImage + '\'' +
                '}';
    }


}

