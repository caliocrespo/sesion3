package miHexagonal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import miHexagonal.core.core.driven_ports.BookRepository;
import miHexagonal.core.core.driver_ports.BookService;
import miHexagonal.core.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {
	@Bean
	BookService bookService(final BookRepository bookRepository) {
		return new BookServiceImpl(bookRepository);

	}

}