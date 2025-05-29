package com.example.controller;

import com.example.domain.Article;
import com.example.form.ArticleForm;
import com.example.service.ArticleService;
import com.example.service.CommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 掲示板の諸機能を制御するコントローラクラス.
 *
 * @author takuto.itami
 */
@Controller
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommentService commentService;

    /**
     * 記事一覧を表示させます.
     *
     * @param model リクエストスコープを格納
     * @param articleForm 記事の入力値チェックに使用します
     * @return 記事一覧ページへフォワード
     */
    @GetMapping("")
    public String showList(Model model, ArticleForm articleForm) {
        model.addAttribute("articles", articleService.getAllArticles());
        return "show-list";
    }


    /**
     * 投稿される記事を保存します.
     *
     * @param articleForm 記事の入力値チェックに使用します
     * @param result エラーメッセージを格納します
     * @param model リクエストスコープを格納
     * @return エラーがあればshowListを呼びます/問題なければ記事一覧ページへフォワード
     */
    @PostMapping("postArticle")
    public String postArticle(@Validated ArticleForm articleForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return showList(model, articleForm);
        }

        Article article = new Article();
        BeanUtils.copyProperties(articleForm, article);
        articleService.insertArticle(article);

        return "redirect:/articles";
    }
}
