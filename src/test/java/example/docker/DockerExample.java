package example.docker;

import model.Article;
import model.Book;
import org.dozer.DozerBeanMapper;
import org.junit.Assert;
import org.junit.Test;

public class DockerExample {
	@Test
	public void test(){
		Book book = prepareBook();

		DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
		Article article = dozerBeanMapper.map(book, Article.class);
		Assert.assertEquals(book.getName(), article.getName());
	}

	private Book prepareBook() {
		Book book = new Book();
		book.setName("Hej Ania");
		return book;
	}
}
