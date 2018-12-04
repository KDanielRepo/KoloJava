package example.mapstruct;

import model.Article;
import model.Book;
import org.junit.Assert;
import org.junit.Test;
import org.mapstruct.factory.Mappers;
import processor.BookMapper;

public class MapstructExample {

	@Test
	public void test(){
		Book book = prepareBook();

		BookMapper mapper = Mappers.getMapper(BookMapper.class);
		Article article = mapper.convert(book);
		Assert.assertEquals(book.getName(), article.getName());
	}

	private Book prepareBook() {
		Book book = new Book();
		book.setName("Hej Ania");
		return book;
	}
}
