package com.ucd.msg.lms.book.catalogue.service;


import com.ucd.msg.lms.book.catalogue.dto.BookDto;
import com.ucd.msg.lms.book.catalogue.entity.Book;
import com.ucd.msg.lms.book.catalogue.repository.BookRepository;
import lombok.val;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddBookService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BookRepository bookRepository;

    public BookDto addBookDetails(BookDto bookDto){

        val bookEntity = bookRepository.save(modelMapper.map(bookDto, Book.class));
        return modelMapper.map(bookEntity, BookDto.class);
    }
}
