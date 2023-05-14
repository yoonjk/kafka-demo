package com.demo.sample.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Book {
	private Integer bookId;
	private String bookName;
	private String author;
}
