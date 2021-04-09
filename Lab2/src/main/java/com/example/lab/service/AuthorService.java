package com.example.lab.service;

import com.example.lab.model.Author;
import com.example.lab.model.Book;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
}
