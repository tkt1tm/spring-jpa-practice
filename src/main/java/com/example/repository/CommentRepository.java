package com.example.repository;

import com.example.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * commentsテーブルを操作するためのリポジトリクラス.
 *
 * @author takuto.itami
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
