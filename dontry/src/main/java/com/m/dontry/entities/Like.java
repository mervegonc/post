package com.m.dontry.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="likes")
public class Like {
 @Id
 Long id;

	Long postId;
	Long userId;
}
