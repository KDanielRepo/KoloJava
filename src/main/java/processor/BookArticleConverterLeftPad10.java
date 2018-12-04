package processor;

import model.Article;
import model.Book;
import org.apache.commons.lang.StringUtils;

class BookArticleConverterLeftPad10 implements Converter<Book, Article> {

	@Override
	public Book convert(Article article) {
		Book book = new Book();
		book.setCreationDate(article.getCreationDate());
		book.setPageNo(article.getPageNo());
		book.setName(StringUtils.leftPad(article.getName(),10,"B"));

		return book;
	}

	@Override
	public Article convert(Book book) {
		Article article =  new Article();
		article.setCreationDate(book.getCreationDate());
		article.setPageNo(book.getPageNo());
		article.setName(StringUtils.leftPad(book.getName(),10,"A"));

		return article;
	}
}
