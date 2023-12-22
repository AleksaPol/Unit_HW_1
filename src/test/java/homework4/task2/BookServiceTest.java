package homework4.task2;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


class BookServiceTest {
    @Test
    void testBookServiceWithMockRepository() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        String idBook = "1";
        Book bookExpected = new Book("1", "Игра в бисер", "Г. Гессе");

        when(bookRepository.findById(idBook)).thenReturn(new Book(idBook, "Игра в бисер", "Г. Гессе"));
        Book book = bookService.findBookById(idBook);
        assertEquals(bookExpected.getAuthor(), book.getAuthor());
        assertEquals(bookExpected.getTitle(), book.getTitle());
        verify(bookRepository, times(1)).findById(idBook);
    }
}