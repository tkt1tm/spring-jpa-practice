package com.example.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * 記事投稿時に入力値を管理するためのフォームクラスです.
 *
 * @author takuto.itami
 */
public class ArticleForm {
    /** 投稿者名 */
    @NotBlank(message = "投稿者名を入力してください")
    @Size(max = 50, message = "投稿者名は50字以内で入力してください")
    private String name;
    /** 投稿内容 */
    @NotBlank(message = "投稿内容を入力してください")
    @Size(max = 150, message = "投稿内容は150字以内で入力してください")
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
