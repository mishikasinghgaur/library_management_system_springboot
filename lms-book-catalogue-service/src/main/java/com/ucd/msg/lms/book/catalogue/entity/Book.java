package com.ucd.msg.lms.book.catalogue.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Document("book-catalogue")
public class Book {
    @Id
    String isbn;
    String bookName;
    String description;

}

