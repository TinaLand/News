package com.example.news.database;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.news.model.Article;

import java.util.List;

public interface ArticleDao {
    @Insert
    void saveArticle(Article article);

    @Query("SELECT * FROM article")
    LiveData<List<Article>> getAllArticles();

    @Delete
    void deleteArticle(Article article);
}
