package processor;

import model.Article;
import model.Book;
import org.apache.commons.lang.StringUtils;

public class BookProcessor implements Processor<Book, Article> {

	private Converter<Book, Article> converter = new BookArticleConverter();

	@Override
	public Converter<Book, Article> getConverter() {
		return converter;
	}

	@Override
	public boolean accept(Book book) {
		return StringUtils.length(book.getName()) > 10;
	}
}
