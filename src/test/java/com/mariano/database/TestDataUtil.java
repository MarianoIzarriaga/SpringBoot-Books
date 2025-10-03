package com.mariano.database;

import com.mariano.database.domain.dto.AuthorDto;
import com.mariano.database.domain.dto.BookDto;
import com.mariano.database.domain.entities.AuthorEntity;
import com.mariano.database.domain.entities.BookEntity;

public final class TestDataUtil {
    private TestDataUtil(){
    }

    public static AuthorDto createTestAuthorDto() {
        return AuthorDto.builder()
                //.id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }

    public static AuthorEntity createTestAuthorA() {
        return AuthorEntity.builder()
                //.id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }

    public static AuthorEntity createTestAuthorB() {
        return AuthorEntity.builder()
                //.id(2L)
                .name("Thomas Cronin")
                .age(44)
                .build();
    }

    public static AuthorEntity createTestAuthorC() {
        return AuthorEntity.builder()
                //.id(3L)
                .name("Jesse A Cassey")
                .age(24)
                .build();
    }

    public static BookEntity CreateTestBookA(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-0")
                .title("The shadow in the attic")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookDto CreateTestBookDtoA(final AuthorDto author) {
        return BookDto.builder()
                .isbn("978-1-2345-6789-0")
                .title("The shadow in the attic")
                .author(author)
                .build();
    }

    public static BookEntity CreateTestBookB(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-1")
                .title("Beyond the horizon")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity CreateTestBookC(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-2")
                .title("The last ender")
                .authorEntity(authorEntity)
                .build();
    }
}
