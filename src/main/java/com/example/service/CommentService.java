package com.example.service;

import com.example.domain.Comment;
import com.example.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * コメントに関する機能の業務処理を行うクラス.
 *
 * @author takuto.itami
 */
@Service
@Transactional
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    /**
     * 渡されたコメントを保存します.
     *
     * @param comment 保存したいコメントオブジェクト
     */
    public void insertComment(Comment comment) {
        commentRepository.save(comment);
    }
}
