package com.lirelivre.lirelivre.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Author {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUTHOR_ID")
	private Long authorId;

	@Setter
	@Column(nullable = false, length = 100)
	private String authorName;				// 작가 이름
}
