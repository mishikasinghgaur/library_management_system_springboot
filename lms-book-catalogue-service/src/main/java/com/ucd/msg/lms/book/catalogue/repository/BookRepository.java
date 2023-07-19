package com.ucd.msg.lms.book.catalogue.repository;

import com.ucd.msg.lms.book.catalogue.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
    //interface is used for complete abstraction
    public void printBookNames();
}
