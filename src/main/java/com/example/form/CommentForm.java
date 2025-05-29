package com.example.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * コメント投稿時に入力値を管理するためのフォームクラスです.
 *
 * @author takuto.itami
 */
public class CommentForm {
    /** コメント投稿者名 */
    @NotBlank(message = "コメント投稿者名を入力してください")
    @Size(max = 50, message = "コメント投稿者名は50字以内で入力してください")
    private String commentName;
    /** コメント内容 */
    @NotBlank(message = "コメント内容を入力してください")
    @Size(max = 150, message = "コメント内容は150字以内で入力してください")
    private String commentContent;
    /** 記事ID */
    private Integer articleId;

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        return "CommentForm{" +
                "commentName='" + commentName + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", articleId=" + articleId +
                '}';
    }
}
