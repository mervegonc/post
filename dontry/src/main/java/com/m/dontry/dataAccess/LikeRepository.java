package com.m.dontry.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m.dontry.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {

}
