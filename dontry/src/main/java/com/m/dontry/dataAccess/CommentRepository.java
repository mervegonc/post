package com.m.dontry.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m.dontry.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
