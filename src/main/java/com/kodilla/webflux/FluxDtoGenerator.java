package com.kodilla.webflux;


import reactor.core.publisher.Flux;

public class FluxDtoGenerator {

    public static void main(String[] args) {
        BookDto b1 = new BookDto("Title1", "Author1", 2000, "Soomething1");
        BookDto b2 = new BookDto("Title2", "Author2", 2001, "Something2");
        Flux<BookDto> bookDtoFlux = Flux.just(b1, b2);

        bookDtoFlux.subscribe(System.out::println);
    }
}
