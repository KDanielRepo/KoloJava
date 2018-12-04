package processor;

import model.Article;
import model.Book;

class BookArticleConverter implements Converter<Book, Article> {

	@Override
	public Book convert(Article article) {
		Book book = new Book();
		book.setCreationDate(article.getCreationDate());
		book.setPageNo(article.getPageNo());
		book.setName(article.getName());

		return book;
	}

	@Override
	public Article convert(Book book) {
		Article article =  new Article();
		article.setCreationDate(book.getCreationDate());
		article.setPageNo(book.getPageNo());
		article.setName(book.getName());

		return article;
	}
}
