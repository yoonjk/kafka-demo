package com.demo.sample.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class LibraryEvent {
	private Integer eventId;
	private Book book;
}
