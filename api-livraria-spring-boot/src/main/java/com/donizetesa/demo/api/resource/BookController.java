package com.donizetesa.demo.api.resource;

import com.donizetesa.demo.api.dto.BookDTO;
import com.donizetesa.demo.api.model.entity.Book;
import com.donizetesa.demo.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {


    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create(@RequestBody BookDTO dto) {
        Book entity =
                Book.builder()
                        .author(dto.getAuthor())
                        .title(dto.getTitle())
                        .isbn(dto.getIsbn())
                        .build();
        entity = service.save(entity);

        return BookDTO.builder()
                .id(entity.getId())
                .author(dto.getAuthor())
                .title(dto.getTitle())
                .isbn(dto.getIsbn())
                .build();
    }

}
