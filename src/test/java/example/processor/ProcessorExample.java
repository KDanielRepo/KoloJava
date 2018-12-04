package example.processor;

import com.google.common.collect.Lists;
import model.Article;
import model.Book;
import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import processor.BookProcessor;
import processor.BookProcessorLeftPad10;
import processor.Processor;

import java.util.List;
import java.util.Optional;

public class ProcessorExample {

	@Test
	public void test(){
		Book book = prepareBook();

		List<Processor<Book, Article>> processors = Lists.newArrayList(new BookProcessor(), new BookProcessorLeftPad10());

		Optional<Processor<Book, Article>> first = processors.stream().filter(f -> f.accept(book)).findFirst();

		Assert.assertEquals("AAHej Ania",first.map(m -> m.getConverter().convert(book).getName()).orElse(StringUtils.EMPTY));
	}

	private Book prepareBook() {
		Book book = new Book();
		book.setName("Hej Ania");
		return book;
	}
}
