package com.example.controller;

import com.example.service.ArticleService;
import com.example.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
     * @return 記事一覧ページへフォワード
     */
    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("articles", articleService.getAllArticles());
        return "show-list";
    }

}
