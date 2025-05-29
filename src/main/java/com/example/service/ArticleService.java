package com.example.service;

import com.example.domain.Article;
import com.example.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
}
