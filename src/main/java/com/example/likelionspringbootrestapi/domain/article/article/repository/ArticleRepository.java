package com.example.likelionspringbootrestapi.domain.article.article.repository;


import com.example.likelionspringbootrestapi.domain.article.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findAllByOrderByIdDesc();
}
