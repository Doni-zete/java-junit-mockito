package com.donizetesa.demo.api.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String isbn;


}
