package com.m.dontry.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
	@Id
	Long id;
	Long userId;

	String title;
	@Lob
	@Column(columnDefinition = "text")
	String text;

}
