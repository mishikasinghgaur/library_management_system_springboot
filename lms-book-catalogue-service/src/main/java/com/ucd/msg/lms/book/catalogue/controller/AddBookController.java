package com.ucd.msg.lms.book.catalogue.controller;

import com.ucd.msg.lms.book.catalogue.dto.BookDto;
import com.ucd.msg.lms.book.catalogue.service.AddBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AddBookController {

    @Autowired
    private AddBookService addBookService;

    @PostMapping(value = "/v1/book")
    public BookDto addBook(@RequestBody BookDto book){

        log.info("You have entered the Add Book Controller");
        return addBookService.addBookDetails(book);
    }
}
