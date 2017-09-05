package com.naresh.books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

	@GetMapping
	public List<String> list(){
		List<String> bookNames = new ArrayList<String>();
		bookNames.add("Core Java");
		bookNames.add("JEE 7");
		bookNames.add("Spring");
		return bookNames;		
	}
}
