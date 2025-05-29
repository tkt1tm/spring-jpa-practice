package com.example.service;

import com.example.domain.Article;
import com.example.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * 記事に関する機能の業務処理を行うクラス.
 *
 * @author takuto.itami
 */
@Service
@Transactional
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    /**
     * 全ての記事を取得します.
     *
     * @return 全ての記事が入ったリスト
     */
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    /**
     * 渡された記事IDを持つ記事を取得します.
     *
     * @param id 取得したい記事のID
     * @return 取得した記事
     */
    public Article getArticleById(Integer id) {
        Optional<Article> article = articleRepository.findById(id);
        return article.orElseThrow(NoSuchElementException::new);
    }

    /**
     * 渡された記事を保存します.
     *
     * @param article 保存したい記事
     */
    public void insertArticle(Article article) {
        articleRepository.save(article);
    }

    /**
     * 渡された記事とコメントを削除します.
     *
     * @param article 削除したい記事
     */
    public void deleteArticle(Article article) {
        articleRepository.delete(article);
    }
}
