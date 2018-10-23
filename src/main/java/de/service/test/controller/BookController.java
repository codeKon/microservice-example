package de.service.test.controller;

import de.service.test.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import de.service.test.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/")
public class BookController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final BookService bookService;

    @Autowired
    public BookController (final BookService bookService){
        this.bookService = bookService;
    }

    @RequestMapping(value="createbook", method = RequestMethod.POST)
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        log.debug("v1 createbook");
        return ResponseEntity.status(HttpStatus.OK).body(bookService.createBook(book));
    }

    @RequestMapping(value="getbooks", method = RequestMethod.GET)
    public ResponseEntity<List<Book>> getBooks(){
        log.debug("v1 getbooks");
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getBooks());
    }
}
