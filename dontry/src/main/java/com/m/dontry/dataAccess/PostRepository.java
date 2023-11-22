package com.m.dontry.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m.dontry.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
