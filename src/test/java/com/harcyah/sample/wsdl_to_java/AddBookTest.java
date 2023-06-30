package com.harcyah.sample.wsdl_to_java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddBookTest {

    @Test
    void testAddBookHasNoArgsConstructor() {
        AddBook addBook = new AddBook();

        assertThat(addBook.getAuthor()).isNull();
    }

    @Test
    void testAddBookHasAllArgsConstructor() {
        AddBook addBook = new AddBook("The Lord of the Rings", "Tolkien");

        assertThat(addBook.getAuthor()).isEqualTo("Tolkien");

    }

    @Test
    void testAddBookHasAllBuilder() {
        AddBook addBook = AddBook.builder().author("Herbert").title("Dune").build();

        assertThat(addBook.getAuthor()).isEqualTo("Herbert");
    }

}
