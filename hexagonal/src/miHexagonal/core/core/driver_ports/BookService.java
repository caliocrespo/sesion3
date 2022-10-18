package miHexagonal.core.core.driver_ports;

import miHexagonal.core.domain.Book;

public interface BookService {
	Book getBook(Long id);
}
