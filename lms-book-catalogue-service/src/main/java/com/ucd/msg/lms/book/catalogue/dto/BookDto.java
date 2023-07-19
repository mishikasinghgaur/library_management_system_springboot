package com.ucd.msg.lms.book.catalogue.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookDto {
    String isbn;
    String bookName;
    String description;
}

