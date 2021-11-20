package com.psl.miniproject21.test;

import static org.mokito.Mokito.when;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.psl.miniproject21.controller.UserController;
import com.psl,miniproject21.controller.BookController;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTes{
	@Autowired
	private UserService service;
	
	@MockBean
	private Bookrepository bookRepository;
	
	public void getBooks() {
		when(bookrepository.findAll().thenReturn(Stream.of(new book(1,"AB","B1",400,100))
				.collect(Collectors.toList())));
		assertEquals(1,service.getBooks().size());
	}
}


