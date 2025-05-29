package com.example.repository;

import com.example.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * articlesテーブルを操作するためのリポジトリクラス.
 *
 * @author takuto.itami
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
