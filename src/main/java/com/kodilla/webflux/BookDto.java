package com.kodilla.webflux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class BookDto {
    private final String title;
    private final String author;
    private final int year;
    private final String somethingMore;
}
