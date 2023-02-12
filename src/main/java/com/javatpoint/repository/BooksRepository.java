package com.javatpoint.repository;

  
import org.springframework.data.repository.CrudRepository;  
import com.example.demo.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  