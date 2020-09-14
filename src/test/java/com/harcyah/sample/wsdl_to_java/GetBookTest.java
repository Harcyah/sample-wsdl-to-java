package com.harcyah.sample.wsdl_to_java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GetBookTest {

    @Test
    public void testGetBookHasNoArgsConstructor() {
        GetBook getBook = new GetBook();

        assertThat(getBook.getID()).isNull();
    }

    @Test
    public void testGetBookHasAllArgsConstructor() {
        GetBook getBook = new GetBook("foo");

        assertThat(getBook.getID()).isEqualTo("foo");

    }

    @Test
    public void testGetBookHasAllBuilder() {
        GetBook getBook = GetBook.builder().id("Beuh").build();

        assertThat(getBook.getID()).isEqualTo("Beuh");
    }

}
