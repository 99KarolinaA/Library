package com.example.lab.web;


import com.example.lab.model.Book;
import com.example.lab.model.enumerations.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/categories")
public class CategoryRestController {
    @GetMapping
    private Category[] findAll() {
        return Category.values();
    }

}
